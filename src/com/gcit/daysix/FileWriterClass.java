package com.gcit.daysix;
import java.io.FileWriter;
import java.io.IOException;

//FileWriter class

public class FileWriterClass {

    public static void main(String[] args) throws IOException
    {
        FileWriter fw = new FileWriter("D:\\myfile.txt");
        fw.write("File WriterClass ");
        fw.write("Java Programming");
        fw.close();
        System.out.println("Successfully written...");
    }
}
