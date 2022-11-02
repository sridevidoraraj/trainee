package com.gcit.daysix;

import java.util.Comparator;

public class CompareByName implements Comparator {

    public int compare(Object o1,Object o2){
        ComparatorClass1 s1=(ComparatorClass1) o1;
        ComparatorClass1 s2=(ComparatorClass1) o2;

        return s1.name.compareTo(s2.name);
    }
}
