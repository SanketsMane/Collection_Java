package sanket_training;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMap 
{
	public static void main(String[] args) {
		
		//To Create HashMap
		HashMap< String, Integer> map = new HashMap<>();
		
		map.put("India", 120);
		map.put("Japan", 200);
		map.put("Usa", 70);
		map.put("Dubai", 50);
		
		//in hashmap data is not printed in inserted manner it is always unordered
		System.out.println(map);
		
		//Search Operation
		//containsKey()
		if(map.containsKey("Dubai"))     //Key is Available
		{
			System.out.println("Key is available.");
		}
		else
		{
			System.out.println("Key Is Not Available.");
		}
		
		
		//get Values Using Key
		
		System.out.println(map.get("India"));
		
		
		
		//Iteration - Map Convert into entry-set
		
		for(Map.Entry<String, Integer> e:map.entrySet())
		{
			System.out.print(" "+ e.getKey());
			System.out.println(" "+  e.getValue());
		
		}
		
		//map.remove() -  used to remove any value using key
		if(map.remove("Usa") != null)
		{
			System.out.println("Removed ... !!");
		}
		else
		{
			System.out.println("Not Available to remove");
		}
		
		
		
		
		
	}

}
