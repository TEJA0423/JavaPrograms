package com.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class NameFinder {
    public static void main(String[] args) {
        String file1Path = "C:\\Users\\Teja\\Documents\\Test.txt"; 
        String file2Path = "C:\\Users\\Teja\\Documents\\Test2.txt";

        Set<String> namesInFile1 = new HashSet<>();
        Set<String> commonNames = new HashSet<>();

        try {
            // Read names from file 1
            BufferedReader file1Reader = new BufferedReader(new FileReader(file1Path));
            String line;
            while ((line = file1Reader.readLine()) != null) {
                namesInFile1.add(line.trim()); // Assuming each name is on a separate line
            }
            file1Reader.close();

            // Read names from file 2 and find the common names
            BufferedReader file2Reader = new BufferedReader(new FileReader(file2Path));
            while ((line = file2Reader.readLine()) != null) {
                String name = line.trim();
                if (namesInFile1.contains(name)) {
                    commonNames.add(name);
                }
            }
            file2Reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print the common names
        System.out.println("Names available in both files:");
        for (String name : commonNames) {
            System.out.println(name);
        }
    }
}