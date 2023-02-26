package com.threequestion;

public class Course {

	private int id;
	private String cname;
	private float fees;

	public Course() {

	}

	public Course(int id, String cname, float fees) {
		super();
		this.id = id;
		this.cname = cname;
		this.fees = fees;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", cname=" + cname + ", fees=" + fees + "]";
	}

}
