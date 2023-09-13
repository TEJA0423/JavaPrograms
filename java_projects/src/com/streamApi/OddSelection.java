package com.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class OddSelection {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Zero","Hello","Two","Wolrd","Four","Welcome to","Six","Vtalent","Eight");
        IntStream.range(0, list.size()).filter(i->i%2==1).mapToObj(i->list.get(i)).forEach(i -> System.out.println(i));
        
	}

}
