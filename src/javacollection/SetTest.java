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
		
		  set.add("hari");
		  set.add("ram");
		  set.add("kamal");
		  set.add("ram");
		  set.add("anup");
		  set.add("pravha");
		  set.add("kamal");
		  set.add("sham");
		  
		  for(String s : set) {
			  System.out.println(s);
		  }
		  
		  /*
		   * a> Set of Student
		   * b> Set of Dog
		   * c> Set of Pen
		   */
		
	}

}
