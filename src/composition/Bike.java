package composition;

public class Bike {

	private int price;
	private String color;
	private String company;

	// Bike has Engine => composition

	class Engine {

		int cc;
		int number;
		String type;

		void printEngine() {
			System.out.println("CC = " + cc);
			System.out.println("Number = " + number);
			System.out.println("Type = " + type);
			System.out.println("Color = " + color);
			System.out.println("Company = " + company);
		}
	}

	public static void main(String[] args) {

		Bike bike = new Bike();
		Engine engine = bike.new Engine();
		engine.cc = 3434;
		engine.number = 454534;
		engine.type = "petrol";
		bike.color = "Red";
		bike.company = "Honda";
		engine.printEngine();
	}
}
