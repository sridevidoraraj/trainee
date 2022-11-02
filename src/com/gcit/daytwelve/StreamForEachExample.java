package com.gcit.daytwelve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamForEachExample {

    public static void main(String args[]){


        List<String> list = new ArrayList<>( Arrays.asList("learn" , "java" , "practice" , "coding"));
        list.stream().filter(s->s.startsWith("j")).forEach(System.out::println);
        System.out.println("********");

        list.stream().filter(x->x.length()>4).forEach(System.out::println);
        System.out.println("********");

        list.stream().mapToInt(i->i.length()).forEach(System.out::println);
    }
}
