package sanket_training;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 
{
	public static void main(String[] args) {
		//It has Very less Time Complxity 
		
		HashSet<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(1);   //set does not allow duplicate elements
		System.out.println("Elements of set are : "+set);
		
		//Search
		if(set.contains(1))
		{
			System.out.println("Set Contain 1");
		}
		if(!set.contains(6))
		{
			System.out.println("Set not Contain 6");
		}
		else
		{
			System.out.println("Value is not Available at set");
		}
		
		//Remove 
		set.remove(1);
		
		if(!set.contains(1))
		{
			System.out.println("Set Does Not Contain 1 -- Deleted Successfully ");
		}
		
		//Size of set
		
		System.out.println("Size of set is : "+set.size());
		
		//Elements of set are
		System.out.println("Elements of set are : "+set);
		
		//iterator
		
		Iterator it =  set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
				
	}

}
