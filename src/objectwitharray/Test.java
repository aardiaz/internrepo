package objectwitharray;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		//store and print data of 5 students
		
		//create array
		Student students[] = new Student[5];
		
		//write data in array
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<students.length; i++) {
			
			Student  s = new Student();
			
			System.out.println("Enter id");
			s.setId(sc.nextInt());
			
			System.out.println("Enter name");
			s.setName(sc.next());
			
			s.setRollno(8009);
			s.setCollege("NCC");
			s.setCity("Ktm");
			
			students[i] = s;
		}
		
		//read data from array
		for(Student std : students) {
			
			  if(std.getCollege().equals("Texas")) {
				  
			  }
			
			System.out.println(std);
		}
		
	}

}
