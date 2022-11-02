package com.gcit.mockito;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)

public class Testing {
    @InjectMocks
    MathApplication mathApplication = new MathApplication();
    @Mock
    Calculator calcService;

    @Test
    public void testAdd() {
        when(calcService.add(10.0, 20.0)).thenReturn(40.00);

        when(calcService.subtract(20.0, 10.0)).thenReturn(20.00);

        //verify(calcService).add(20.0, 30.0);

        Assert.assertEquals(mathApplication.add(10.0, 20.0), 40.0, 0);
        Assert.assertEquals(mathApplication.add(10.0, 20.0), 40.0, 0);
        Assert.assertEquals(mathApplication.add(10.0, 20.0), 40.0, 0);

        Assert.assertEquals(mathApplication.subtract(20.0, 10.0), 20.0, 0.0);

        verify(calcService).subtract(20.0, 10.0);

        verify(calcService, times(3)).add(10.0, 20.0);

        verify(calcService, never()).multiply(10.0, 20.0);
    }
}
