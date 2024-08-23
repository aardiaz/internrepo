package javaString;

public class EqualityTest {
	
	public static void main(String[] args) {
		
		String s1 = "Java";
		String s2 = "Hello";
		String s3 = new String("Java");
		String s4 = "Java";
		
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.equals("java"));
//		System.out.println(s1.equalsIgnoreCase("java"));
//		
//		System.out.println(s1.equals("Java"));
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		System.out.println(s1 == s4);
	}

}
