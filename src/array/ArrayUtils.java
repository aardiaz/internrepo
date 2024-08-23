package array;

import java.util.Arrays;

public class ArrayUtils {
	
	public static void main(String[] args) {
		
		int data[] = {345,54,56,56,75,7,67,87,3,4,5};
		
		Arrays.fill(data, 800);
		System.out.println(Arrays.toString(data));
		
		Arrays.fill(data, 3, 9, 400);
		System.out.println(Arrays.toString(data));
		
		System.out.println(Arrays.toString(Arrays.copyOf(data, 5)));
		
		int[]  newArray = Arrays.copyOfRange(data, 2, 10);
		System.out.println(Arrays.toString(newArray));
	}

}
