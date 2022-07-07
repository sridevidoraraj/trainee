package com.gcit.dayfour;
//6. Iterating an array using while loop.
public class WhileLoop {
    public static void main(String args[]){
        int[] numbers = {2, 4, 6, 8, 10};
        int index = 0;
        while (index < numbers.length) {
            System.out.println(numbers[index]);
            index++;
        }

    }
}
