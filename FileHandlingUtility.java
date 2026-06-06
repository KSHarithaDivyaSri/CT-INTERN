package filehandling;

import java.io.*;
import java.util.Scanner;

public class FileHandlingUtility {

    static final String FILE_NAME = "sample.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            
            FileWriter writer = new FileWriter(FILE_NAME);
            writer.write("Hello! This is a Java File Handling Utility.\n");
            writer.write("This file demonstrates read, write, and modify operations.\n");
            writer.close();
            System.out.println("File written successfully.");

            
            System.out.println("\nReading file content:");
            BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

            
            FileWriter appendWriter = new FileWriter(FILE_NAME, true);
            appendWriter.write("New line added after modification.\n");
            appendWriter.close();
            System.out.println("\nFile modified successfully.");

            
            System.out.println("\nReading modified file content:");
            BufferedReader modifiedReader = new BufferedReader(new FileReader(FILE_NAME));
            while ((line = modifiedReader.readLine()) != null) {
                System.out.println(line);
            }
            modifiedReader.close();

        } catch (IOException e) {
            System.out.println("An error occurred while handling the file.");
            e.printStackTrace();
        }

        sc.close();
    }
}