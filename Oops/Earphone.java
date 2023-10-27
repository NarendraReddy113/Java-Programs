package Oops;

public class Earphone {

	String brand;
	int price;
	String color;

	public Earphone(String brand, int price, String color) {
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	public void earphoneDeatils() {
		System.out.println(brand);
		System.out.println(price);
		System.out.println(color);
	}
}
