package Oops;

public class Account {

	private long accNo;
	private double balance;
	private int pwd;
	User1 user;

	public Account(long accNo, double balance, int pwd, User1 user) {
		this.accNo = accNo;
		this.balance = balance;
		this.pwd = pwd;
		this.user = user;
	}

	public long getAccNo() {
		return accNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getPwd() {
		return pwd;
	}

	public void setPwd(int pwd) {
		this.pwd = pwd;
	}

	public boolean verifyPassword(int pwd) {
		if (this.pwd == pwd) {
			return true;
		} else {
			return false;
		}
	}

	public void depositAmount(int pwd, double amount) {
		if (this.pwd == pwd) {
			this.balance = this.balance + amount;
			System.out.println(amount + " is credited");
			System.out.println(this.balance + "is this available balance");
		} else {
			System.out.println("Password is incorrect");
		}
	}

	public void withdrawAmount(int pwd, double amount) {
		if (this.pwd == pwd) {
			if (amount <= this.balance) {
				this.balance = this.balance - amount;
				System.out.println(amount + "is debited");
				System.out.println(this.balance + "is this available balance");
			} else {
				System.err.println("Insufficient balance");
			}
		}
	}

}
