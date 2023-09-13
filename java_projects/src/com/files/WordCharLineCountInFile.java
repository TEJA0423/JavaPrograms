package com.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCharLineCountInFile{   
    public static void main(String[] args) {
    	   String filePath = "C:\\Users\\Teja\\Documents\\Test.txt" ;  
           
           int characterCount = 0;
           int wordCount = 0;
           int lineCount = 0;
           
           try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
               String line;
               
               while ((line = reader.readLine()) != null) {
                   lineCount++;
                   characterCount += line.length();
                   
                   // Split the line into words based on spaces
                   
                   String[] words = line.trim().split("\\s+");
                   wordCount += words.length;
               }
           } catch (IOException e) {
               System.out.println("An error occurred while reading the file.");
               e.printStackTrace();
           }
           
           System.out.println("Character count: " + characterCount);
           System.out.println("Word count: " + wordCount);
           System.out.println("Line count: " + lineCount);
       }
   }



