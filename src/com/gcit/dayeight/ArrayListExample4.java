package com.gcit.dayeight;

// ArrayList example to add elements

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample4 {

    public static void main(String args[]){
        List<String> string = new ArrayList<>();

        string.add("shiva");
        string.add("ram");
        string.add("ganesha");

        System.out.println("before adding : " +string);
        List<String> string1 = new ArrayList<>();
        string1.add("mani");
        string1.add("govind");
        string.addAll(string1);
        System.out.println("after adding : " +string);

        List<String> string2 = new ArrayList<>();
        string2.add("1");
        string2.add("2");
        string.addAll(2,string2);
        System.out.println("after adding : " +string);

        string.remove(3);
        System.out.println("after removing : " +string);
    }
}
