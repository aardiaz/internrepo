package array;

import java.util.Arrays;

public class ArrayWithMethod {
	
	/*
	 *  ---------------- Array With method -------------
	 *  
	 *  1> Array as a parameter/arguments
	 *  
	 *       void  sum(float[] x){
  	 *           
	 *       }
	 *  
	 *  2> Array as return type
	 *  
	 *        int[]  get130IntValue(){
	 *        
	 *             //array = 9,45,46,5,65,65,65,65,6,5
	 *        
	 *           return array;
	 *        }
	 */
	
	public static void main(String[] args) {
		
		int[]  data = {4,56,78,90,89,76,54,35,67,8};
		sumOfArray(data);
		
		//sumOfArray(new int[] {4,56,78,90,89,76,54,35,67,8});
		
		String[]  cities = getCitites();
		System.out.println(Arrays.toString(cities));
		
		int[]  odds = getOddNumsFrom1To100();
		System.out.println(Arrays.toString(odds));
	}
	
	//------------- array as arguments --------------------
	static void sumOfArray(int values[]) {
		
		     int s = 0;
		     
		   for(int  x : values) {
			   s  = s + x;
		   }
		   
		   System.out.println("Total sum = "+s);
	}
	
	//----------------- array as return type --------------------
    static  String[]   getCitites() {
    	 
    	 String[]  cities = {"Pokhara","Dang","Dhangadhi","Dharan"};
    	 
    	 return cities;
     }
	
   static  int[]   getOddNumsFrom1To100() {
    	
    	int[]  oddnums = new int[50];
    	int j = 0;
    	
    	for(int i=1; i<=100; i++) {
    		
    		  if(i%2 != 0) {
    			  oddnums[j] = i;
    			  j++;
    		  }
    	}
    	
    	return oddnums;
    }
	
	
}
