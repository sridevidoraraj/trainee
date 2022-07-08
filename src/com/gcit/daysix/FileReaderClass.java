package com.gcit.daysix;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//File Reader class
public class FileReaderClass {
    public static void main(String [] args) throws IOException
    {
        try
        {
            FileReader fr = new FileReader("D:\\myfile.txt");
            int i;
            while((i = fr.read()) != -1)
            {
                System.out.print((char) i);
            }
            System.out.println("");
            fr.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: " +e.getMessage());
        }
    }
}
