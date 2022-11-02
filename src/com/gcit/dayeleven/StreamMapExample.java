package com.gcit.dayeleven;

//Stream Map method example

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {

    public static void main(String args[]){

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        List<Integer> Square = list.stream().map(x->x*x).collect(Collectors.toList());

        System.out.println(Square);

    }
}
