package com.gcit.daysix;

//Generic Class
    class Myclass<T>
{
    T obj;
    Myclass(T obj)
    {
        this.obj = obj;
    }

    T getObj()
    {
        return obj;
    }
}
    public class GenericClass
{
        public static void main(String[] args)
    {

        Myclass<Integer> obj1 = new Myclass<Integer>(50);
        System.out.println("Value stored: " +obj1.getObj());
        Myclass<Float> obj2 = new Myclass<Float>(50.20f);
        System.out.println("Value stored: " +obj2.getObj());
        Myclass<String> obj3 = new Myclass<>("WELCOME");
        System.out.println("Value stored: " +obj3.getObj());
    }
}

