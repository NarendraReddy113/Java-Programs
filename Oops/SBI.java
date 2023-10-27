package Oops;

public class SBI extends Bank {

	String branch;
	String ifsc;
	Account account;

	public SBI(String bankname, String managername, String branch, String ifsc) {
		super(bankname, managername);
		this.branch = branch;
		this.ifsc = ifsc;
	}

	public void createAccount(Account account) {
		if (this.account == null) {
			this.account = account;
			System.out.println("Account is created succesfully");
		} else {
			System.out.println("Account is already created");
		}
	}

	public void checkbalance(int pwd) {
		if (this.account == null) {
			System.out.println("Account is not created");
		} else {
			if (account.verifyPassword(pwd)) {
				System.out.println(account.getBalance() + "is available balance");
			} else {
				System.out.println("Invalid password");
			}
		}
	}

	public void deposit(int pwd, double amount) {
		if (this.account == null) {
			System.out.println("Account does not exist");
		} else {
			if (account.verifyPassword(pwd)) {
				account.depositAmount(pwd, amount);
			} else {
				System.out.println("Invalid password");
			}
		}
	}

	public void withdraw(int pwd, double amount) {
		if (this.account == null) {
			System.out.println("Account does not exist");
		} else {
			if (account.verifyPassword(pwd)) {
				account.withdrawAmount(pwd, amount);
			} else {
				System.out.println("Invalid password");
			}
		}
	}

	public void changePassword(int oldPassword, int newPassword) {
		if (this.account == null) {
			System.out.println("Account doesn't exist");
		} else {
			if (account.verifyPassword(oldPassword)) {
				account.setPwd(newPassword);
				System.out.println("Password has been changed successfully");
			} else {
				System.out.println("Password mismatch");
			}
		}
	}

}
