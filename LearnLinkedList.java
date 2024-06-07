package sanket_training;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LearnLinkedList 
{
	
	public static void main(String[] args) {
		
			LinkedList l = new LinkedList();
			
			
			a.put(null, null);
			
			//isEmpty
			System.out.println(l.isEmpty());
			
			//add
			
			l.add("abc");
			l.add("dfg");
			l.add("hyt");
			l.add("sgc");
			
			System.out.println(l);
			
			//set()
			
		    l.set(0, "Sanket");
		    l.set(1, "Vijay");
		    l.set(2, "Sujay");
		    l.set(3, "Raj");
		    
		    System.out.println(l);
		    
		    //get
		    
		    System.out.println("Get Output : "+2);
		    
		    //removeLast()
		    
		    
		    l.removeLast();
		    System.out.println(l);
		    
		    //addFirst()
		    
		    l.addFirst("aaa");
		    System.out.println(l);
		    
		    //size()
		    
		    System.out.println(l.size());
		    
		    //l.getLast() will show the last element 
		    System.out.println("Last element : " +l.getLast());
		    
		    //Index Of operation Will Show the Index of element
		   System.out.println("Index Of : "+l.indexOf("Sujay"));
		   
		   System.out.println("Element : "+l.element());
		   
		   //pollLast Will Show Last Element 
		   
		   System.out.println("Pool Last : "+l.pollLast());
		   
		   //getClass it will return class of object
		   System.out.println("Get Class : "+l.getClass());
		   
		   //it will show the last iterator Value 
		   System.out.println("Last Iterator : "+l.listIterator());
		   
		 
		   
		   
		    
		    
		    
	}

}
