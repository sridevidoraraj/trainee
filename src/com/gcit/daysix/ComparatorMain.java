package com.gcit.daysix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparatorMain {

    public static void main(String args[]){
    ArrayList al=new ArrayList();
    al.add(new ComparatorClass1(101,"Vijay",23));
    al.add(new ComparatorClass1(106,"Ajay",27));
    al.add(new ComparatorClass1(105,"Jai",21));

        System.out.println("Sorting by Name");

    Collections.sort(al,new CompareByName());
        Iterator itr=al.iterator();
    while(itr.hasNext()){
        ComparatorClass1 st=(ComparatorClass1) itr.next();
        System.out.println(st.rollno+" "+st.name+" "+st.age);
    }

        System.out.println("Sorting by age");

    Collections.sort(al,new CompareByAge());
    Iterator itr2=al.iterator();
    while(itr2.hasNext()) {
    ComparatorClass1 st = (ComparatorClass1) itr2.next();
    System.out.println(st.rollno + " " + st.name + " " + st.age);
}
}
}
