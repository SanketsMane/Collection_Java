package sanket_training;

import java.util.ArrayList;
import java.util.Iterator;

public class LearnArrayList 
{
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		
		//is Empty is Used To Check Array Is Empty or not 
		System.out.println(a.isEmpty());
		
		//add is Used to fill Data inside the arraylist
		a.add("Sanket");
		a.add("Vaishnavi");
		a.add("Vijay");
		
		//ArrayList Will Allow Null Values
		a.add(null);
		
		System.out.println(a);
		
		//size() is used to size of array
		System.out.println(a.size());
		
		//a.remove is used to remove data using index
		
		a.remove(2);
		
		System.out.println(a);
		
	//get is used to access particular element in ArrayList
		
		System.out.println("get is implimented : "+a.get(2));
		
		
		//addAll is used to merge the array-list 
		ArrayList<String> b = new ArrayList<>();
		b.add("sujay");
		b.add("jay");
		b.add("Vikas");
		b.add("amit");
		
		a.addAll(b);
		
		System.out.println(a);
		
	
		//Clear() will remove all the data inside ArrayList
		b.clear();
		
		System.out.println(a);
		
		System.out.println(a.contains("Vijay"));
		
		
		System.out.println("====================");
		
		//for-each
		for(String element:a)
		{
			System.out.println(element);
		}
		
		System.out.println("============================");
		
		//Iterator
		
		Iterator<String> it = a.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}

