package cn.cuc.sims.model;

public class Administrator extends Teacher {
	public Administrator(String id, String password, String name, String sex, int age, String jno) {
		super(id, password, name, sex, age, jno);
	}
	public Administrator(Administrator a) {
		super(a);
	}
}
