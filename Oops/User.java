package Oops;

import java.util.Objects;

public class User {
	private String userName;
	private long cno;
	private String gender;

	User() {
	}

	User(String userName) {
		this();
		this.userName = userName;
	}

	User(String userName, long cno) {
		this(userName);
		this.cno = cno;
	}

	User(String userName, long cno, String gender) {
		this(userName, cno);
		this.gender = gender;
	}

	public String getUserName() {
		return userName;
	}

	public long getCno() {
		return cno;
	}

	public String getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return userName + "\n" + cno + "\n" + gender;
	}

	@Override
	public boolean equals(Object o) {
		User u = (User) o;
		return this.userName.equals(u.userName) && this.cno == u.cno && this.gender.equals(u.gender);
	}

	@Override
	public int hashCode() {
		return Objects.hash(userName, cno, gender);
	}

	public void userDetails()
 {
  System.out.println("User name : "+userName);
  System.out.println("Contact number : "+cno);
  System.out.println("Gender : "+gender);
 }
}