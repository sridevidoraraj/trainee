package com.gcit.dayeight;

//Sort ArrayList

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample3 {

    public static void main(String args[]){

        List<String> string = new ArrayList<>();
        string.add("division");
        string.add("addition");
        string.add("subtraction");
        string.add("multiplication");

        System.out.println("before sorting : " +string);
        Collections.sort(string);

        System.out.println("after sorting : " +string);

        List<Integer> integer = new ArrayList<>();
        integer.add(45);
        integer.add(11);
        integer.add(22);
        integer.add(5);

        System.out.println("before sorting : " +integer);
        Collections.sort(integer);

        System.out.println("after sorting : " +integer);

    }
}
