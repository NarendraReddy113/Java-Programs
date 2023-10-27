package Oops;

public class Engine {

	String brand;
	int noOfCylinders;
	int hrp;

	public Engine(String brand, int noOfCylinders, int hrp) {
		this.brand = brand;
		this.noOfCylinders = noOfCylinders;
		this.hrp = hrp;
	}

	public void engineDetails() {
		System.out.println(brand);
		System.out.println(noOfCylinders);
		System.out.println(hrp);
	}

}
