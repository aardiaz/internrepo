package javacollection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestAll {
	
	public static void main(String[] args) {
		
		List<Integer> list = List.of(43,34,454,6,65,56,56,5,767,7,67,76);
		
		 Set<String> set = Set.of("ktm","pok","dhn","dharan","delhi");
		
		  Map<String,Integer> map = Map.of("java",35000, "php",20000,"Python", 19000);
		  
		  
		  list.forEach(x -> System.out.println(x));
		  set.forEach(y -> System.out.println(y));
		  map.forEach((a,b) -> System.out.println(a+" = "+b));
		  
		  map.keySet().forEach(System.out::println);
		  //map.values().forEach(val -> System.out.println(val));
		  map.values().forEach(System.out::println);
		  
		   List<Integer> list2 = Arrays.asList(43,34,454,6,65,56,56,5,767,7,67,76);
		  Collections.sort(list2);
		  System.out.println(list2);
		  
		  Collections.reverse(list2);
		  System.out.println(list2);
	}

}
