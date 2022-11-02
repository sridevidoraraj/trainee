package com.gcit.dayfour;
//9. default case in Java switch-case
public class DefaultCase {
    public static void main(String args[]){

        char grade = 'E';
        switch(grade){
            case 'A':
                System.out.println("excellent");
                break;
            case 'B':
                System.out.println("good");
                break;
            case 'c':
                System.out.println("improve");
                break;
            case 'D':
                System.out.println("fail");
                break;
            default:
                System.out.println("invalid grade");
                break;
        }
        System.out.println("ur grade is : " +grade);

    }
}
