package com.gcit.daysix;
import java.util.*;
public class CompareByAge implements Comparator
{

    public int compare(Object o1,Object o2){
      ComparatorClass1 s1=(ComparatorClass1) o1;
        ComparatorClass1 s2=(ComparatorClass1) o2;

        if(s1.age==s2.age)
            return 0;
        else if(s1.age>s2.age)
            return 1;
        else
            return -1;
    }
}
