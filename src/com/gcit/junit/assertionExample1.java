package com.gcit.junit;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class assertionExample1 {

    @Test
    public void assertTest() {
        String s1 = "java";
        String s2 = "learn";
        Assertions.assertNotEquals(s1, s2);
    }

    @Test
    public void assertArrayTest() {
        char[] a = {'j', 'a', 'v', 'a'};
        char[] b = "java".toCharArray();
        Assertions.assertArrayEquals(a, b);
    }

    @Test
    public void assertNullArrayTest() {
        int[] a = null;
        int[] b = null;
        Assertions.assertArrayEquals(a, b);
        Assertions.assertArrayEquals(new int[]{1, 2, 3}, new int[]{1, 2, 3}, "Array Equal Test");
    }

    @Test
    public void assertNullAndNotNull() {
        Object obj = new Object();
        Assertions.assertNotNull(obj);
        String str = null;
        Assertions.assertNull(str);
    }

    @Test
    public void assertSame() {
        String s1 = "java";
        String s2 = s1;
        String s3 = "learn";
        //Assertions.assertSame(s1,s2);
        //Assertions.assertSame(s1,s3);
        //Assertions.assertNotSame(s1,s2);
        Assertions.assertNotSame(s1, s3);
    }

    @Test
    public void assertTrueFalse() {
        Assertions.assertTrue(5 > 4, "5 is greater than 4");
        Assertions.assertFalse(5 > 6, "5 is not greater than 6");
    }

}
