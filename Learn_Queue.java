package ACME;

import java.util.LinkedList;
import java.util.Queue;

public class Learn_Queue 
{
	public static void main(String args[])
	{
	
	//Queue will follow first in first out concept
//		Main Properties of Queue
//		offer
//		poll
//		peek
		
		Queue<Integer> q1 = new LinkedList<>();
		
		//q1.offer(1); is used to add elements in queue or we can use add also to add element in queue  if any methood will shows the exception
				
		q1.offer(1);
		q1.offer(2);
		q1.offer(3);
		q1.offer(4);
		q1.offer(5);
		q1.offer(6);
		q1.offer(7);
		
		System.out.println(q1);
		
//		it will shows which element is going to be out first 
		
		System.out.println(q1.poll());
		
		//it shows nest element which going to out
		System.out.println(q1.peek());
		
		//Element is used to show the head of the queue it will throw exception when the queue is empty
		
		System.out.println(q1.element());
		
		
		//Remove is used to remove the element from  the queue 
		
		
		
	
	}
	

}
