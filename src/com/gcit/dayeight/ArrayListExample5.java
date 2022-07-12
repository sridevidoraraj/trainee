package com.gcit.dayeight;

//Searching for elements in an ArrayList

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample5 {

    public static void main(String args[]){
        List<Integer> integer = new ArrayList<>();
        integer.add(1);
        integer.add(2);
        integer.add(3);

        System.out.println("elements contained " +integer.contains(2));
        System.out.println("index of : " +integer.indexOf(3));

        ArrayList arrayList = new ArrayList();
        arrayList.add(new Integer(290483));
        arrayList.add(new Integer(503562));
        arrayList.add(new Integer(806162));

        Object obj = Collections.max(arrayList);
        System.out.println("maximum of integer : " +obj);

        Object obj1 = Collections.min(arrayList);
        System.out.println("maximum of integer : " +obj1);
    }
}
