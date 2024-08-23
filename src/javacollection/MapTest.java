package javacollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
	
	public static void main(String[] args) {
		
		//subject => marks
		
	//	Map<String, Integer> map = new HashMap<>();
	//	Map<String, Integer> map = new TreeMap<>();
		Map<String, Integer> map = new LinkedHashMap<>();
		
		map.put("science", 90);
		map.put("math", 96);
		map.put("nepali", 80);
		map.put("english", 79);
		map.put("computer", 98);
		
		for(String key : map.keySet()) {
			System.out.println(key+" = "+map.get(key));
		}
		
	}

}
