package com.gcit.dayOne.com.gcit.daytwotask;

public class subclass3 implements Area {
    @Override
    public void square(int side) {
        System.out.println("area of square : " +(4*side));
    }

    @Override
    public void rectangle(int length, int breadth) {
        System.out.println("area of rectangle: " +(length * breadth));
    }
    public static void main(String args[]){
        subclass3 s3 = new subclass3();
        s3.square(4);
        s3.rectangle(4,5);
}

}
