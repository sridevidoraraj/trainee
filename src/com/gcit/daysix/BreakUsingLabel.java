package com.gcit.daysix;
// break statement with labeled for loop
public class BreakUsingLabel {
    public static void main(String args[]){
        // Outer for loop.
        aa:
        for(int i = 1; i <= 3; i++)
        {
            bb:
            // Inner for loop.
            for(int j = 1; j <= 3; j++){
                if(i == 2 && j == 2)
                    break bb; // Using break statement with label.
                System.out.println(i + " " + j);
            }
        }
    }
}
