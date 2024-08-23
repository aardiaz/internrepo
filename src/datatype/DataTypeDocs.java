package datatype;

public class DataTypeDocs {
	
	/*
	 * ------------------ Data Type ----------------------
	 * # proper data representation
	 * # proper memory allocation
	 * # proper operation to be perform
	 * 
	 * # Types :
	 * 
	 * 1> Primitive  : 
	 * 		a> byte
	 * 		b> short
	 * 		c> int
	 * 		d> long
	 * 		e> float
	 * 		f> double
	 * 		g> char    => 'a','@','M'
	 * 		h> boolean => true/false
	 * 
	 * 2> Non-Primitive :
	 * 		a> String
	 * 		b> Array
	 * 		c> Classes
	 * 		d> Collection
	 * 		e> Enums
	 */
	
	public static void main(String[] args) {
		
		long x = 80000000000L;
		float p = 1.25f;
		byte k = 127;
		
		System.out.println("byte = "+Byte.SIZE+" "+Byte.MIN_VALUE+" "+Byte.MAX_VALUE);
        System.out.println("short = "+Short.SIZE+" "+Short.MIN_VALUE+" "+Short.MAX_VALUE);
		  
	}
	
	/*
	 * -------------------------------------------------------
	 * | S.N |  Data Type |  Size   |  MIN_VALUE  | MAX_VALUE|
	 * -------------------------------------------------------
	 * |  1. |    byte    |   8 bit |   -128      |   +127   |
	 * -------------------------------------------------------
	 */

}
