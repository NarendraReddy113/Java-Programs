package Oops;

public class Mobile {

	String brand;
	int price;
	Earphone earphone;

	public Mobile(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}

	public void insertEarphone(Earphone earphone) {
		if (this.earphone == null) {
			this.earphone = earphone;
			System.out.println("Earphone is inserted");
		} else {
			System.out.println("Earphone is not inserted");
		}
	}

	public void removeEarphone() {
		if (this.earphone == null) {
			System.out.println("Earphone not exists");
		} else {
			this.earphone = null;
			System.out.println("Earphone has been removed");
		}
	}

	public void mobileWithEarphoneDetails() {
		if (this.earphone == null) {
			System.out.println("Earphone not exists");
		} else {
			earphone.earphoneDeatils();
			mobileDetails();
		}
	}

	public void mobileDetails() {
		System.out.println(brand);
		System.out.println(price);
	}
}
