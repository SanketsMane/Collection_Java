package sanket_training;

import java.util.ArrayList;

public class LearnArrayList2 
{
	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>();
		
		
		//Equals is Used to check the elements in 2 lists are same or not 
		
		System.out.println(list1.isEmpty());
		
		list1.add("Ajay");
		list1.add("Vijay");
		
		System.out.println(list1);
		
		System.out.println("======================");
		
		ArrayList<String> list2 = new ArrayList<>();
		
		System.out.println(list2.isEmpty());
		
		list2.add("Ajay");
		list2.add("p");
		
		System.out.println(list2);
		
		System.out.println(list1.equals(list2));
		
		

		
		
	}

}
