package com.gcit.daytwelve;

import java.util.Arrays;
import java.util.List;

public class StreamReduceExample1 {
    public static void main(String args[]){

        List<Integer> list1 = Arrays.asList(11,33,44,21);
        int result = list1.stream().filter(x -> x % 11== 0).reduce(0,(ans,i) -> ans+i);

        System.out.println(result);
    }

}
