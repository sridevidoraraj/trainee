package com.gcit.dayten;

//merge() method

import java.util.HashMap;

public class HashMapExample5 {
    public static void main(String args[]){
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"learn");
        hm.put(2,"java");
        hm.put(3,"practice");

        System.out.println("original hashmap : " +hm);

        String value = hm.merge(4,"coding" , (oldvalue , newvalue) -> oldvalue + newvalue);

        System.out.println("merged value : " +value);

        System.out.println("result : " +hm);

//containskey() method

        if(hm.containsKey(2)){
            System.out.println("key is present ");
        }else{
            System.out.println("key not present");
        }

//containsvalue() method

        if(hm.containsValue("Shiva")){
            System.out.println("value is present");
        }else{
            System.out.println("value not present");
        }

        System.out.println("size of the hashmap is : " +hm.size());

        hm.clear();

        System.out.println("clear the hash map : " +hm);
    }
}
