package array;

import java.util.Scanner;

public class MulDArray {
	
	/*
	 * ------------- MultiD Array --------------------
	 *   # use to represent data in row and column form/table/matrix form.
	 *   
	 *   # Syntax :
	 *   
	 *      data_type   array_name[][] = new data_type[row][col];
	 *      
	 */
	
	public static void main(String[] args) {
		
		   //create array
		  int mat[][] = new int[2][2];
		  
		  /*      c0 c1
		   *   R0 [90][]
		   *   R1 [][]
		   */
		  
		  //write data in array
		  Scanner  sc = new Scanner(System.in);
		  
		 for(int i=0; i<2; i++) { 
			 
			   for(int j=0; j<2; j++) {
				   
				   System.out.println("Enter value ");
				   mat[i][j] = sc.nextInt();
			   }
		 }
		  
		  //read data from array
		 
		   for(int i=0; i<2; i++) {
			   
			     for(int j=0; j<2; j++) {
			    	 System.out.print(mat[i][j]+" ");
			     }
			     
			     System.out.println();
		   }
		
	}

}
