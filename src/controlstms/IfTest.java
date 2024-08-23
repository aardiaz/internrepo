package controlstms;

import java.util.Scanner;

public class IfTest {
	
	/*
	 *  # syntax :
	 *     
	 *       if(condition){
	 *          //statements
	 *       }
	 *       
	 *         OR
	 *         
	 *         if(condition)  
	 *           //single statement
	 */
	
	public static void main(String[] args) {
		
		int salary;
		Scanner  sc = new Scanner(System.in);
		
		System.out.println("Enter your salary ");
		salary = sc.nextInt();
		
		if(salary < 40000) {
		    salary = salary + 8000;
		}
		
		System.out.println("Your Total Salary = "+salary);
		
	}

}
