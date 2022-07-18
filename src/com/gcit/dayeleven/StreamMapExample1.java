package com.gcit.dayeleven;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample1 {
    public static void main(String args[]){

        List<String> list = Arrays.asList("learn" , "java" , "practice" , "coding");
        System.out.println("original list : " +list);

        List<String> answer = list.stream().map(String::toUpperCase).
                collect(Collectors.toList());
        System.out.println("The stream after applying "
                + "the function is : ");
        System.out.println(answer);
    }
}
