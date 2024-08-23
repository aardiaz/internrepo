package encapsulation;

public class Test {
	
	public static void main(String[] args) {
		
		Product p = new Product();
		
		 p.setId(3434);
		 p.setName("Mobile");
		 p.setPrice(90000);
		 p.setCompany("samsung");
		 
		 System.out.println(p);

//		System.out.println("Id = "+p.getId());
//		System.out.println("Name = "+p.getName());
//		System.out.println("Company = "+p.getCompany());
//		System.out.println("Price ="+p.getPrice());
	}

}
