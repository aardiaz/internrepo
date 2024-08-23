package javaString;

public class Immutable_Mutable_Test {
	
	/*
	 *  ------------ immutable -----------------
	 *  # we can't edit/modify or change original 
	 *    state of object at runtime is known as 
	 *    immutable object and respective class
	 *     is called immutable class.
	 *     
	 *    e.g.
	 *       String,Integer,Float,Double etc.
	 *       
	 *    
	 *    --------------- Mutable --------------
	 *     # can change state of object at runtime.
	 *     
	 *     e.g.
	 *       StringBuffer,StringBuilder,ArrayList etc.
	 */
	
	public static void main(String[] args) {
		
		//immutable
		String s = "Hello"; // s[Hello]
		   s.concat(" Hari"); // [Hello Hari]
		System.out.println(s);
		
		//mutable
		StringBuffer  sb = new StringBuffer("Hello");// sb[Hello Hari dkfkfldfkfdkkjfd] 
		sb.append(" Hari");
		System.out.println(sb);
		
	}

}
