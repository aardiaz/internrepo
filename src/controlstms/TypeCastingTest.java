package controlstms;

public class TypeCastingTest {
	
	/*
	 *  ------------- Type Casting ------------------
	 *  # syntax :
	 *  
	 *     data_type  variable = (data_type) value;
	 *     
	 *   1> Implicit(auto) Type casting :
	 *       byte -> short -> int -> long -> float -> double 
	 *       
	 *   2> Explicit(by force) Type casting :  
	 *   	double -> float -> long -> int -> short -> byte -> char 
	 */
	
	public static void main(String[] args) {
		//explicit type casting
		  int x = 5678;
		  byte k = (byte) x; 
		  
            //implicit type casting
		  byte p = 124;
		  short d = p; //auto
		  
		  float s = 244.34343f;
		  double v = s;
		  
		  long m = (long) v;
	}

}
