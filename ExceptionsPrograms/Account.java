package ExceptionsPrograms;

public class Account {
	String accHolderName;
	double balance;
	int pwd;

	public Account(String accHolderName, double balance, int pwd) {
		super();
		this.accHolderName = accHolderName;
		this.balance = balance;
		this.pwd = pwd;
	}

	public void checkPwd(int pwd) {
		try {
			if (this.pwd != pwd) {
				throw new PasswordIncorrectException();
			}
		} catch (PasswordIncorrectException e) {
			System.err.println(e.getMessage());
		}
	}

	public void checkBalance(double amount) {
		try {
			if (this.balance < amount) {
				throw new InsufficientBalanceException();
			}
		} catch (InsufficientBalanceException e) {
			System.err.println(e.getMessage());
		}
	}

	public void withdraw(int pwd, double amount) {
		if (this.pwd == pwd) {
			if (this.balance >= amount) {
				this.balance -= amount;
				System.out.println(amount + " has withdrawn");
				System.out.println(this.balance + " is the available balance");
			} else {
				checkBalance(amount);
			}
		} else {
			checkPwd(pwd);
		}
	}

	public void balanceEnquiry(int pwd) {
		if (this.pwd == pwd) {
			System.out.println(this.balance + " is the available balance");
		} else {
			checkPwd(pwd);
		}
	}

	public void deposite(int pwd, double amount) {
		if (this.pwd == pwd) {
			this.balance += amount;
			System.out.println(amount + " has deposited");
			System.out.println(this.balance + " is the available balance");
		} else {
			checkPwd(pwd);
		}
	}
}

class PasswordIncorrectException extends RuntimeException {
	@Override
	public String getMessage() {
		return "Enter correct password!!!";
	}
}

class InsufficientBalanceException extends RuntimeException {
	@Override
	public String getMessage() {
		return "Amount should be less or equal to balance!!!";
	}
}

class Program {

}