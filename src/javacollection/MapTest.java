package javacollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
	
	public static void main(String[] args) {
		
		//subject_name  and marks
		
		//Map<String, Integer>  map = new HashMap<>();
		//Map<String, Integer>  map = new TreeMap<>();
		Map<String, Integer>  map = new LinkedHashMap<>();
		
		map.put("Nepali", 90);
		map.put("Science", 80);
		map.put("Math", 95);
		map.put("Computer", 99);
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		for(String key : map.keySet()) {
			
			System.out.println(key+" = "+map.get(key));
		}
		
		
		/*
		 * Q> find Total marks, Avg.Marks and Percentage of following
		 *    subjects.(Solve this using Map)
		 *    
		 *             T1 T2 T3 T4   TM   Avg.  Percent
		 *    Math   = 88,78,90,60
		 *    Nepali = 70,80,87,69
		 *    English= 90,60,70,80
		 *    Computer=99,69,79,89
		 *    Social  = 50,70,80,55
		 *   
		 *    Hint :
		 *      Map<String, List<Integer>>  map = new HashMap<>();
		 *      
		 *      map.put("Nepali",List.of(88,78,90,60));
		 */
	}

}
