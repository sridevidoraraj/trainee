package com.gcit.daysix;

//Generic Method
    class Myclass1
{
    public static <T> void display(T[] array)

    {
        for(T t : array)
        {
            System.out.print(t+ " ");
        }
        System.out.println();
    }
}
    public class GenericMethod

    {
        public static void main(String[] args)
    {
        Integer[ ] arr1 = {20, 30, 40, 50, 60, 70};
        System.out.println("Reading Integer objects: ");
        Myclass1.display(arr1);

        Double[ ] arr2 = {20.20, 30.30, 40.40, 50.50, 60.60};
        System.out.println("Reading Double objects: ");
        Myclass1.display(arr2);

        String[ ] arr3 = {"New York", "Sydney", "Paris", "London"};
        System.out.println("Reading String objects: ");
        Myclass1.display(arr3);
    }
}

