package Oops;

public class Car {

	String brand;
	String color;
	double price;
	Engine engine;

	// Early Instantiation
	public Car(String brand, String color, double price, Engine engine) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.engine = engine;
	}

	public void carDetails() {
		System.out.println(brand);
		System.out.println(color);
		System.out.println(price);
	}

}
