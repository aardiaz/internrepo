package corejava;

import java.util.Scanner;

public class Sum {
	
	public static void main(String[] args) {
	 
		printArray(new Integer[] {34,34,35,4,56,56,56,565,6});
		printArray(new String[] {"ddd","erere","uuuueee","dfdffd","pppp"});
		
		
	}
	
	
	 static <T> void printArray(T t[]){
		  
		  for(T x : t) {
			  System.out.println(x);
		  }
		
	}
	 
	 static <T> void findSum(T x, T y) {
		 
		    
	 }
	 
}
