package edu.handong.analysis.datamodel;

public class Student {
	static String name;

	public Student(String name) {
		edu.handong.analysis.datamodel.Student.name = name;
	}

	public String getName() {
		return name;
	}
}