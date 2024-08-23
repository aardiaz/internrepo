package javacollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
	
	public static void main(String[] args) {
		
		//List<String>  list = new ArrayList<>();
		List<String>  list = new LinkedList<>();
		
		list.add("nepal");
		list.add("china");
		list.add("japan");
		list.add("korea");
		list.add("canada");
		
		list.remove(2);
		list.remove("china");
		
		System.out.println(list.contains("canada"));
		
		for(String s : list) {
			System.out.println(s);
		}
		
		
//		List<Student>  list = new ArrayList<>();
//		     Student s = new Student();
//		     s.setId(343);
//		     ----------
//		     ---------
//		   list.add(s); 
	}

}
