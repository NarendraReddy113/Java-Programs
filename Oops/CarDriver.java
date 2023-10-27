package Oops;

public class CarDriver {

	public static void main(String[] args) {
		Car car=new Car("Audi", "Black", 770000, new Engine("Mustang", 4, 125));
		car.carDetails();
		car.engine.engineDetails();
	}
}
