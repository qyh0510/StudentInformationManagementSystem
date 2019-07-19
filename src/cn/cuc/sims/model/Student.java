package cn.cuc.sims.model;

public class Student extends User {
	private String sno;		//Ñ§ºÅ
	private int credit;		//Ñ§·Ö

	public Student(String id, String password, String name, String sex, int age, String sno, int credit) {
		super(id, password, name, sex, age);
		this.sno = sno;
		this.credit = credit;
	}
	public Student(Student s) {
		super(s);
		this.sno = s.sno;
		this.credit = s.credit;
	}
	
	public void setSno(String sno) {
		this.sno = sno;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public String getSno() {
		return sno;
	}
	public int getCredit() {
		return credit;
	}
}
