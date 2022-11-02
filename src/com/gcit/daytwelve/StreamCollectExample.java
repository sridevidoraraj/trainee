package com.gcit.daytwelve;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectExample {

    public static void main(String args[]){

        Map<String, Integer> map = Stream.of("one" , "two" ,"three" , "four" , "five").distinct()
                .collect(Collectors.toMap(Function.identity(),s -> (int) s.chars().distinct().count()));

        System.out.println(map);

    }
}
