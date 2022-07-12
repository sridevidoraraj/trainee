package com.gcit.dayeight;

//LinkedList Example

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample1 {
    public static void main(String args[]){
        LinkedList<String> string = new LinkedList<>();
        string.add("learn");
        string.add("java");
        string.add("practice");
        string.add("code");

        Iterator<String> iterator = string.iterator();
        while(iterator.hasNext()){
            System.out.println("printing the strings : " +iterator.next());
        }
    }
}
