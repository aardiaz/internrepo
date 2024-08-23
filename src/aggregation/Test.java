package aggregation;

public class Test {
	
	public static void main(String[] args) {
		
		Car  c = new Car();
		c.setColor("Red");
		c.setPrice(9000000);
		c.setModel("MK900");
		
		Employee  emp = new Employee();
		emp.setId(6789);
		emp.setName("Parash Sha");
		emp.setCity("Ktm");
		emp.setSalary(5000000);
		emp.setCar(c);
		emp.setCars(c,c);
		
		System.out.println("Id = "+emp.getId());
		System.out.println("Name = "+emp.getName());
		System.out.println("Salary = "+emp.getSalary());
		System.out.println("---------- car data--------");
		System.out.println("Color = "+emp.getCar().getColor());
		System.out.println("Price = "+emp.getCar().getPrice());
		System.out.println("Model = "+emp.getCar().getModel());
	}

}
