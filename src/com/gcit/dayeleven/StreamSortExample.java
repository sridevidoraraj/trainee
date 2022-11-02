package com.gcit.dayeleven;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortExample {

    public static void main(String args[]){

        List<String> names =
                Arrays.asList("Reflection","Collection","Stream");
        System.out.println("original list : " +names);
        List<String> show =
                names.stream().sorted().collect(Collectors.toList());
        System.out.println("sorted list : " +show);

    }
}
