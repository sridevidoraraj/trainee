package com.gcit.daytwelve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamCollectOperation {

    public static void main(String args[]){

        List<Integer> number = Arrays.asList(6,2,8,4,5,2);

        Set<Integer> square = number.stream().map(x->x*x).collect(Collectors.toSet());

        System.out.println("collected list : " +square);

        Set<Integer> sort = number.stream().sorted().collect(Collectors.toSet());

        System.out.println("sorted list : " +sort);

    }
}
