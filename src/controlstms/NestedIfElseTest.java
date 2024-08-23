package controlstms;

public class NestedIfElseTest {
	
	  /*
	   * ------------- nested if-else ---------------
	   * 
	   *   #syntax :
	   *     
	   *        if(condition-1){
	   *        
	   *            if(condition-2){
	   *               
	   *                 if(condition-3){
	   *                     //statements
	   *                 }else{
	   *                 
	   *                 }
	   *               
	   *            }else{
	   *            
	   *            }
	   *        
	   *        }else{
	   *        
	   *        }
	   */
	
	public static void main(String[] args) {

			String citizen = "nepali";
			int age = 100;
			boolean  haveVoterId = false;
			
			if(citizen.equals("nepali")) {
				
				    if(age >= 18) {
				    	 
				    	   if(haveVoterId) {
				    		   System.out.println("Thank you for vote");
				    	   }else {
				    		   System.out.println("You dont have voteId ");
				    	   }
				    	
				    }else {
				    	System.out.println("You are under age !!");
				    }
			}else {
				System.out.println("invalid citizen !!");
			}
		
	}

}






