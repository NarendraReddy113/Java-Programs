package Oops;

public class Vegetable {

	String vname;
	String vcolor;
	int vprice;

	public Vegetable(String vname, String vcolor, int vprice) {

		this.vname = vname;
		this.vcolor = vcolor;
		this.vprice = vprice;
	}

	public void vegetableDetails() {
		System.out.println(vname);
		System.out.println(vcolor);
		System.out.println(vprice);
	}
	
	
}
