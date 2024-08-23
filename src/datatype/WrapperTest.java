package datatype;

public class WrapperTest {
	
	/*
	 * ----------------- Wrapper Classes -----------------
	 * # every primitive data type have its own respective class
	 *   is known as wrapper class.
	 *   
	 * # wrapper class contains so many in-build method that are
	 *   use to processing primitive values/data.
	 *   
	 *    Primitive_type          Wrapper Type
	 *  -----------------		----------------
	 *  	byte 					Byte
	 *      short					Short
	 *      int						Integer
	 *      long					Long
	 *      float					Float
	 *      double					Double
	 *      char					Character
	 *      boolean					Boolean      
	 * 
	 */
	
	public static void main(String[] args) {
		
		//'a' is int varible only
		int a = 900;
		
		//'x' is reference variable 
		Integer x = 9000;
		 
		/*
		 * ----------------- Auto-boxing -----------------
		 *  # conversion of primitive type into wrapper type is known as auto-boxing.
		 */
		
		 long m = 43345455;
		 Long n = m; //auto boxing
		 
		 Long uu = new Long(m);
		  
		/*
		 * -------------- Auto un-boxing----------------------------
		 *  # conversion of wrapper type into primitive type.
		 */
		 
		 Double t = 567343.789;
		 double dt = t; //auto un-boxing
		 
		 System.out.println(Integer.toBinaryString(8000));
		 System.out.println(Integer.toOctalString(8000));
		 System.out.println(Integer.toHexString(8000));
		 
		 
	}
}
