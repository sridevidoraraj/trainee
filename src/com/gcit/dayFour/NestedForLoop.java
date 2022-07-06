package com.gcit.dayFour;
//4. Example of Nested for-loop.
public class NestedForLoop {
    public static void main(String args[]){
        int n = 5;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
