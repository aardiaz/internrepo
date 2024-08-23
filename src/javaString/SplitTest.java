package javaString;

public class SplitTest {
	
	public static void main(String[] args) {
		
		String s = "Happy Birth Happy day to you nepal day happy";
		 String[] words = s.split("\\s");
		  
		 int cnt = 0;
		  for(String w : words) {
			  
			    if(w.equalsIgnoreCase("happy")) {
			    	cnt++;
			    }
			  System.out.println(w);
		  }
		  
		  System.out.println(cnt);
		   
	}

}
