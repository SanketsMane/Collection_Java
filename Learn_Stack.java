package ACME;

import java.util.Stack;

public class Learn_Stack 
{
	public static void main(String args[])
	{
	//Stack is a last in first out 
	
	Stack<String> animals = new Stack<>();
	
	//here in stack we use push methood to insert element 
	
	animals.push("lion");
	animals.push("Tiger");
	animals.push("Elephant");
	
	System.out.println(animals);
	
	
	//to check top element in stack we use peek 
	
	System.out.println("Tom Element - "+animals.peek());
	
	
	
	
	}
	

}
