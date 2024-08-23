package constructor;

public class User {
	
	//instance variable
	String username;
	String password;
	
	//-------------- default constructor ---------------
	 User(){
		 username = "admin";
		 password = "123";
	 }
	
	//----------------- parameterized constructor -----------
	User(String username, String password){
		
		 // this(); //calling default constructor
		  //this("","");//calling parameterized constructor
		
		this.username = username;
		this.password = password;//calling instance variables
		
		this.printUser();//calling instance methods
		
		/*
		 * # 'this' keyword represents current object.
		 *   a. we can call instance variables using this.
		 *   b. we can call instance methods. 
		 *   b. we can call constructors.
		 */
	}
	
	User(String username){
		
		this.username = username;
	}
	
	void printUser() {
		System.out.println("UserName = "+username);
		System.out.println("Password = "+password);
	}
	
	public static void main(String[] args) {
		
		User u = new User("hari", "p999");
		u.printUser();
		
		//User u1 = new User("aa", "nn");
		
		/**
		 * Class {@code Object} is the root of the class hierarchy.
		 * Every class has {@code Object} as a superclass. All objects,
		 * including arrays, implement the methods of this class.
		 */
		 
	}

}
