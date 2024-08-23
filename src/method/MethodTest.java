package method;

public class MethodTest {
	
	public static void main(String[] args) {
		
		// sum();
		// printTable(876);
		//int  sum = getSumOf1To100();
	   //	System.out.println("sum of 1 to 100 = "+sum);
	
	      // int sv = getSmallestValue(78767, 878766);
	       System.out.println("smallest value = "+getSmallestValue(78767, 878766));
	}
	
	//1. no return type with no arguments
	static void sum() {
		
		int x = 4534;
		int y = 8990;
		
		int s = x + y;
		System.out.println("Total = "+s);
	}
	
	//2. no return type with arguments
	static void printTable(int n) {
		
		  for(int i=1; i<=10; i++) {
			  System.out.println(n+" x "+i+" = "+(n*i));
		  }
	}
	
	//3. return type with no arguments
	static int   getSumOf1To100() {
		
		  int s = 0;
		    
		  for(int i=1; i<=100; i++) {
			s = s + i;  
		  }
		
		  return s;
	}
	
	//4. return type with arguments
	static int getSmallestValue(int a, int b) {
		
		  if(a < b)
			  return a;
		  
		  return b;
	}

}
