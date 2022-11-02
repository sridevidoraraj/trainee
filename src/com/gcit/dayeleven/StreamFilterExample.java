package com.gcit.dayeleven;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StreamFilterExample {

    public static void main(String args[]){

        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        myList.stream()
                .filter(n -> n%2 == 0)
                .forEach(System.out::println);
        System.out.println();

//find duplicate elements in a given integers list

        List<Integer> myList1 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set = new HashSet();
        myList1.stream()
                .filter(n -> !set.add(n))
                .forEach(System.out::println);
    }
}
