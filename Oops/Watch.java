package Oops;

public class Watch {

	private String brand;
	private String color;
	private double price;

	Watch() {

	}

	Watch(String brand) {
		this();
		this.brand = brand;
	}

	Watch(String brand, String color) {
		this(brand);
		this.color = color;
	}

	Watch(String brand, String color, double price) {
		this(brand, color);
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void watchDetails() {
		System.out.println(brand);
		System.out.println(color);
		System.out.println(price);
	}
}
