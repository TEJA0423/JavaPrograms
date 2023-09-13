package com.files;

import java.io.*;

public class MergeFiles {
    public static void main(String[] args) {
    	
        String file1Path = "C:\\Users\\Teja\\Documents\\Test.txt"; 
        String file2Path = "C:\\Users\\Teja\\Documents\\Test2.txt"; 
        
        String outputFilePath = "C:\\Users\\Teja\\Documents\\output.txt"; 

        try {
            // Open the input files and output file
            BufferedReader reader1 = new BufferedReader(new FileReader(file1Path));
            BufferedReader reader2 = new BufferedReader(new FileReader(file2Path));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));

            // Read and write the content of the first input file
            String line;
            while ((line = reader1.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            // Read and write the content of the second input file
            while ((line = reader2.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            // Close the reader and writer
            reader1.close();
            reader2.close();
            writer.close();

            System.out.println("Files merged successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}