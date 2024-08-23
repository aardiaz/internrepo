package aggregation;

import java.util.List;

public class Employee {
	
	private int id;
	private String name;
	private int salary;
	private String city;
	private Car car; //HAS-A relationship
	
	//employee has exactly 2 cars
	private Car[] cars = new Car[2];
	private List<Car> carList;
	
	public List<Car> getCarList() {
		return carList;
	}
	public void setCarList(List<Car> carList) {
		this.carList = carList;
	}
	public Car[] getCars() {
		return cars;
	}
	public void setCars(Car car,Car c) {
		this.cars[0] =car;
		this.cars[1] = c;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	

}
