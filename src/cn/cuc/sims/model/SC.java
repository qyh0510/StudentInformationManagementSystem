package cn.cuc.sims.model;

public class SC {
	private String sno;		//Ñ§ºÅ
	private String cno;		//¿Î³ÌºÅ
	private int grade;		//³É¼¨
	
	public SC(String sno, String cno, int grade) {
		this.sno = sno;
		this.cno = cno;
		this.grade = grade;
	}
	
	public void setSno(String sno) {
		this.sno = sno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getSno() {
		return sno;
	}
	public String getCno() {
		return cno;
	}
	public int getGrade() {
		return grade;
	}
}
