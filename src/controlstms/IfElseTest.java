package controlstms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.List;
import java.util.Set;

public class IfElseTest {
	
	/*
	 * ------------- if-else -------------
	 * # if there is exactly two conditions.
	 * 
	 *  # syntax :
	 *    
	 *     if(condition){
	 *        //statements
	 *     }else{
	 *       //statements
	 *     }
	 */

	 public static void main(String[] args) {
		 
		      Dog d1 = new Dog(2, "aa");
		      Dog d2 = new Dog(2, "aa");
		      Dog d3 = new Dog(2, "555");
		      
		      
		      System.out.println(d1.hashCode());
		      System.out.println(d2.hashCode());
		      System.out.println(d3.hashCode());
		
	          List<Dog> list = Arrays.asList(new Dog(2, "bb"), new Dog(4, "ddd"), new Dog(2, "aa"),new Dog(10, "kk"));
	          
	          Set<Dog> set = new HashSet<>();
	          set.addAll(list);
	          
	          System.out.println(set);
	          
	}
}








