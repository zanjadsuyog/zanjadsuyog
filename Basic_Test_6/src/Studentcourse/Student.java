package Studentcourse;

public class Student {
	private int id;
	private String name;
	private double marks;
	private Course course;

	public Student(int id, String name, double marks, Course course) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getMarks() {
		return marks;
	}

	public Course getCourse() {
		return course;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student{" + "id=" + id + ", name='" + name + '\'' + ", marks=" + marks + ", course=" + course + '}';
	}
}



