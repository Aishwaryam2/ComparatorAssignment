package demo.ty.com;

import java.util.Comparator;

public class StudentId implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		return o1.id-o2.id;
		
	
	}
	

}
