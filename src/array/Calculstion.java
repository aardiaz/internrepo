package array;

public class Calculstion {
	
	public static void main(String[] args) {
		
		int mat1[][] = {{12,13,14},{20,30,40},{60,70,80}};
		int mat2[][] = {{1,2,3},{5,6,7},{8,5,4}};
		
		int mat3[][] = new int[3][3];
		
		//addition
		
		for(int i=0; i<3; i++) {
			
			  for(int j=0; j<3; j++) {
				  
				    mat3[i][j] = mat1[i][j]+ mat2[i][j];
				    
				    System.out.print(mat3[i][j]+" ");
			  }
			  
			  System.out.println();
		}
		
		
		
	}

}
