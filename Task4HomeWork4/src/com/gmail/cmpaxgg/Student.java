package com.gmail.cmpaxgg;

public class Student extends Human {
	private String faculty;
	private int course;

	public Student(String name, String lastname, int age, boolean sex, String faculty, int course) {
		super(name, lastname, age, sex);
		this.faculty = faculty;
		this.course = course;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub

	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public String toString() {
		return super.toString() + " faculty=" + faculty + ", course=" + course + "]";
	}
}
