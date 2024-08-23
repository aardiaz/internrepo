package controlstms;

public class SwitchTEst2 {
	public static void main(String[] args) {
		
		String day = "skldfkldf";
		
		switch(day) {
		
		case "sunday" :
		case "monday" :
		case "tuesday" :
			System.out.println("system implementation");
		    break;
			
		case "wednesday" :
		case "thrueday" :
		case "friday" :
			System.out.println("system testing");
			break;
			
			
		case "saturday" :
			System.out.println(" do rest");
			break;
			
		default :
			System.out.println("invalid");
		}
		
	}

}
