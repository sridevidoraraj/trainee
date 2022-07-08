package com.gcit.daysix;
// continue statement within while loop

public class ContinueUsingWhileLoop {
    public static void main(String[] args) {
        int x = 1;
        while (x <= 10) {
            if (x == 5) {
                x++;
                continue;
            }
            System.out.println(x);
            x++;
        }
    }
}
