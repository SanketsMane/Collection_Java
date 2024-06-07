package ACME;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue 
{
	
	public static void main(String args[])
	{
		//Priority-Queue is used to perform mean and max operation
		//Comparator.reverseOrder() - will show the priority wise element
        //Comparator comparatator.reverseordere used to compare elements between the PriorityQueue here the first element will be the biggest element
		
		Queue<Integer> qe = new PriorityQueue(Comparator.reverseOrder());
		qe.offer(12);
		qe.offer(21);
		qe.offer(34);
		qe.offer(43);
		qe.offer(56);
		qe.offer(67);
		
		System.out.println(qe);
		
		//poll will assign the priority wise sequence
		
		qe.poll();
		System.out.println(qe);
		
		//peek will shows the next priority element 
	
		System.out.println(qe.peek());
		

	}

}
