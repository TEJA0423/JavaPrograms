package com.collections;

import java.util.*;

public class StackClass {

		// Pushing element on the top of the stack
		 static void push(Stack<Integer> stack)
		    {
			 System.out.println("Push Operation:");
		        for(int i = 0; i < 5; i++)
		        {
		        	Integer push = (Integer) stack.push(i);
		        	 System.out.println(push);
		        }
		    }
		 
		// Popping element from the top of the stack
		    static void pop(Stack<Integer> stack)
		    {
		        System.out.println("Pop Operation:");
		 
		        for(int i = 0; i < 5; i++)
		        {
		            Integer y = (Integer) stack.pop();
		            System.out.println(y);
		        }
		    }
		 // Displaying element on the top of the stack
		    static void peek(Stack<Integer> stack)
		    {
		        Integer element = (Integer) stack.peek();
		        System.out.println("Element on stack top: " + element);
		    }
		     
		    // Searching element in the stack
		    static void search(Stack<Integer> stack, int element)
		    {
		        Integer pos = (Integer) stack.search(element);
		 
		        if(pos == -1)
		            System.out.println("Element not found");
		        else
		            System.out.println("Element is found at position: " + pos);
		    }
		 
		 
		    public static void main (String[] args)
		    {
		        Stack<Integer> stack = new Stack<Integer>();
		 
		        push(stack); 
		        pop(stack);
		        push(stack);
		        peek(stack);
		        search(stack, 2);
		        search(stack, 6);
		    }

	}

