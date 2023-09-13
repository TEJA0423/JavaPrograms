package com.streamApi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFileData {

	public static void main(String[] args) throws IOException{
		
	String filename ="C:\\Users\\Teja\\Documents\\Test.txt";
	
//	Stream<String> lines = Files.lines(Paths.get(filename));
//	lines.forEach(line -> System.out.println(line));
	
	try (Stream<String> lines = Files.lines(Paths.get(filename))){
		lines.forEach(line -> System.out.println(line));
	}
	catch(Exception e) {
		e.printStackTrace();
	}

	}

}
