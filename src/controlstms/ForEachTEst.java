package controlstms;

public class ForEachTEst {
	
	/*
	 *  ------------ for Each loop --------------------------
	 *  # use to read data from collection(array,list,set,map etc)
	 *  
	 *  # syntax :
	 *  
	 *     for(data_type  var : collection){
	 *           //statements
	 *      }
	 */
	
	public static void main(String[] args) {
		
		int[]  values   = {3,2,45,67,89,87,65,43,24,56,7};
		int s = 0 ;
		
		for(int x : values) {
			System.out.println(x);
			s += x;
		}
		System.out.println("Total = "+s);
	}

}





