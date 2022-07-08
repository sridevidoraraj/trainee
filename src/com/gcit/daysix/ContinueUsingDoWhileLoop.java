package com.gcit.daysix;
//Continue statement in do-while loop

public class ContinueUsingDoWhileLoop {
    public static void main(String[] args)
    {
        int x = 1;
        do{
            if(x == 5){
                x++;
                continue;
            }
            System.out.println(x);
            x++;
        } while(x <= 10);
    }
}
