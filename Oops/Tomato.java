package Oops;

public class Tomato extends Vegetable {

	public Tomato(String vname, String vcolor, int vprice) {

		super(vname, vcolor, vprice);

	}

	public static void main(String[] args) {
		Vegetable vegetable = new Vegetable("Potato", "Light brown", 50);
		vegetable.vegetableDetails();

		Tomato t = new Tomato("Organic tomato", "Red", 200);
		t.vegetableDetails();
	}

}
