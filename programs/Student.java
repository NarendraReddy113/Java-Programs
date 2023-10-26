package programs;

public class Student {

	String sname;
	int sid;
	long cno;

	Student() {

	}

	Student(String sname) {
		this();
		this.sname = sname;
	}

	Student(String sname, int sid) {
		this(sname);
		this.sid = sid;
	}

	Student(String sname, int sid, long cno) {
		this(sname, sid);
		this.cno = cno;
	}

	public void studentDetails() {
		System.out.println(sname);
		System.out.println(sid);
		System.out.println(cno);
	}
}
