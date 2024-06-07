package sanket_training;

import java.util.ArrayList;

public class ArrayListCloneExample 
{
    public static void main(String[] args) 
    {
    	ArrayList<String> list1 = new ArrayList<>();
		
		System.out.println(list1.isEmpty());
		
		list1.add("Ajay");
		list1.add("psdasd");
		
		//Here Ensure Capacity is used to define fix capacity of the arrayList
		list1.ensureCapacity(3);
		//This method is useful when you know beforehand how many elements you are going 
		//to add to the ArrayList, and you want to avoid the overhead of resizing the internal
		//array multiple times as elements are added.
		
		System.out.println("Orignal is : "+list1);
		
		ArrayList<String> cloneList = (ArrayList<String>) list1.clone();
		
		System.out.println("Clone is : "+cloneList);
		
		list1.ensureCapacity(3);
		
		System.out.println();
		
		//it will show the hash code of the ArrayList
		System.out.println(list1.hashCode());
		
		
		
	}
}
