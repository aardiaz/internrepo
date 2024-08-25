package javacollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	
	public static void main(String[] args) {
		
		//Set<String>  set = new HashSet<>();
		//Set<String>  set = new TreeSet<>();
		Set<String>  set = new LinkedHashSet<>();
		
		set.add("ram");
		set.add("hari");
		set.add("ram");
		set.add("kapil");
		set.add("hari");
		set.add("suman");
		set.add("anup");
		
		for(String s : set) {
			System.out.println(s);
		}
		
		/*
		 * 1> Set of Dog
		 * 2> Set of Employee
		 */
		
	}

}
