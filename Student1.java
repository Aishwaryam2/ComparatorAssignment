package demo.ty.com;

import java.util.Comparator;

public class Student1 implements Comparator<Student1> {
	int id;
	String name;
	int marks;
	int age;
	
	public Student1(int id, String name, int marks, int age) {
		
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.age = age;
	}

	@Override
	public int compare(Student1 o1, Student1 o2) {
		return this.id-o2.id;
	}

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", marks=" + marks + ", age=" + age + "]";
	}
	

	

}
