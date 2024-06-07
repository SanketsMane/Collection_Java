package ACME;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arraylist1 
{
	
	public static void main(String args[])
	{
		
		List<Integer>  list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		
	
		
		System.out.println(list);
		
		list.add(5);
		list.add(6); 
		
		//here list will add new elements at the end .
		
		System.out.println(list); 
		
		//Array List Indexing 
		
		list.add(2,10);
		System.out.println(list);
		
		//We Can ASdd list in-size new list 
		
		List<Integer> newlist = new ArrayList<>();
		
		newlist.add(140);
		newlist.add(150);
		
		list.addAll(newlist);
		//with add addAll function we can add new list into old one
		
		System.out.println(list);
		
		
		//To get particular element from the list
		System.out.println(list.get(2));
		
		//with list.get(index_no); we can get the actual element we want
		
		//to remove element in array we use remove
		
		list.remove(2);
		
		System.out.println(list); 
		
		//To Remove complete list we use Clear() 
		
		//list.clear();
		
		//To modify values from list we use set methood
		
		list.set(3, 200);
		System.out.println(list);
		
		//To Check Random values from the list use use contains
		
		System.out.println(list.contains(150));
		
		//to know the no of elements in list we use list.size
		
		list.size();
		
		//to print particular element in the arraylist
		
		try {
		for(int i=0;i<=list.size();i++)
		{
			System.out.println("Elements : "+ list.get(i));
		}
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
		
		
		//for each loop
		
		for(Integer element:list)
		{
			System.out.println("For Each Element : "+element);
		}
		
		
		//Iterator - 
		//Every collection framework have a iterator
		
		Iterator<Integer> it = list.iterator();
		//iterator will contain multiple functionality 
		//them are multiple methood can be available in iterator
		//HasNext - 
		             //it will shows next value to be print
		while(it.hasNext())
		{
			System.out.println("Iterator = "+it.next());
		}
		
		
	}

}
