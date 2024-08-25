package javacollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import objectwitharray.Student;

public class ListTest {
	
	public static void main(String[] args) {
		
		//List<String>  list = new ArrayList<>();
		List<String>  list =   new LinkedList<>();
		
		list.add("nepal");
		list.add("india");
		list.add("china");
		list.add("korea");
		
		//System.out.println(list.contains("china"));
		list.remove(2);
		list.remove("india");
		//list.clear();
		 
		for(String s : list) {
			System.out.println(s);
		}
		
	   
//		List<Student>  slist =   new ArrayList<>();
//		
//		   Student  s = new Student();
//		     ---------
//		     -------------
//		     -------
//		slist.add(s);
		
		/*
		 * a> List of Student
		 * b> List of Book
		 */
		
	}

}
