package sanket_training;

import java.util.Collections;
import java.util.LinkedList;

public class LearnSortingLinkedList 
{
	
	 public static void main(String[] args) {
	        
	        LinkedList<Integer> linkedList = new LinkedList<>();
	        
	        // Add elements to the linked list
	        linkedList.add(5);
	        linkedList.add(1);
	        linkedList.add(3);
	        linkedList.add(2);
	        linkedList.add(4);

	        // Print the original linked list
	        System.out.println("Original linked list: " + linkedList);

	        // Sort the linked list in ascending order
	        Collections.sort(linkedList);

	        // Print the sorted linked list
	        System.out.println("Sorted linked list: " + linkedList);
	    }

}
