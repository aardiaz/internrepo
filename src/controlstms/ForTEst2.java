package controlstms;

public class ForTEst2 {

	public static void main(String[] args) {
		
		int es = 0;
		int os = 0;
		
		for (int i = 1; i <= 100; i++) {
			//s = s + i;
			
			 if(i%2 == 0) {
				 es = es + i;
			 }else {
				 os += i;
			 }
		}
		
		System.out.println("Sum of Evens = "+es);
		System.out.println("Sum of odds = "+os);
		System.out.println("-----------------");
		System.out.println("Total = " + (es+os));

	}

}
