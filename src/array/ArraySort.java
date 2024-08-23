package array;

import java.util.Arrays;

public class ArraySort {
	
	public static void main(String[] args) {
		
		//5
		//5-1=0->4
		
		int[]  values = {5,66,57,8,90,76,5,43,56,73,45};
		
		Arrays.sort(values);
		System.out.println(Arrays.toString(values));
		
		System.out.println("-------reverse--------");
		for(int i=values.length-1; i >= 0; i--) {
			System.out.print(values[i]+" ");
		}
		
		
		
		
		
	}

}
