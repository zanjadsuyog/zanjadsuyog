package Studentcourse;

import java.util.ArrayList;

class Course {
	private int cid;
	private String cname;
	private double fees;

	public Course(int cid, String cname, double fees) {
		this.cid = cid;
		this.cname = cname;
		this.fees = fees;
	}

	public int getCid() {
		return cid;
	}

	public String getCname() {
		return cname;
	}

	public double getFees() {
		return fees;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Course{" + "cid=" + cid + ", cname='" + cname + '\'' + ", fees=" + fees + '}';
	}
}

class CourseManager {
	private ArrayList<Course> courses = new ArrayList<>();

	public void addCourse(Course course) {
		courses.add(course);
		System.out.println("Course added successfully.");
	}

	public void deleteCourse(int cid) {
		for (Course course : courses) {
			if (course.getCid() == cid) {
				courses.remove(course);
				System.out.println("Course deleted successfully.");
				return;
			}
		}
		System.out.println("Course with ID " + cid + " not found.");
	}

	public void updateCourse(int cid, String cname, double fees) {
		for (Course course : courses) {
			if (course.getCid() == cid) {
				course.setCname(cname);
				course.setFees(fees);
				System.out.println("Course updated successfully.");
				return;
			}
		}
		System.out.println("Course with ID " + cid + " not found.");
	}

	public void displayAllCourses() {
		System.out.println("List of all courses:");
		for (Course course : courses) {
			System.out.println(course);
		}
	}

	public void displayCourseById(int cid) {
		for (Course course : courses) {
			if (course.getCid() == cid) {
				System.out.println(course);
				return;
			}
		}
		System.out.println("Course with ID " + cid + " not found.");
	}
}

class StudentManager {
	private ArrayList<Student> students = new ArrayList<>();

	public void addStudent(Student student) {
		students.add(student);
	}
}
