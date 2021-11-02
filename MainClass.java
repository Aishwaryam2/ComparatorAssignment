package demo.ty.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;



public class MainClass {
	
	static Scanner sc = new Scanner(System.in);
	static void display() {
		System.out.println("To check the details please follow the instructions"+"\n"+"1 for Id"+"\n"+"2 for Name " + "\n"+"3 for Marks"+ "\n" +"4 for age" +"\n");
		
			
	}
	

	public static void main(String[] args) {
		ArrayList<Student1> arrayList = new ArrayList<Student1>();
		arrayList.add(new Student1(1,"Sneha",55,24));
		arrayList.add(new Student1(2,"Hema",56,22));
		arrayList.add(new Student1(3,"neha",52,21));
		arrayList.add(new Student1(4,"Ahana",51,20));
		
		int n=1;
		while(n>=1 && n <=4) {
			display();
			n= sc.nextInt();
			if(n==1) Collections.sort(arrayList,new StudentId());
			else if(n==2) Collections.sort(arrayList,new StudentName());
			else if(n==3) Collections.sort(arrayList,new StudentMarks());
			else Collections.sort(arrayList,new StudentAge());
			System.out.println(arrayList);
			System.out.println("Do you want to sort it again");
			System.out.println("Type"+" "+"Yes"+"/"+"No");
			String st = sc.next();
			if(st.equals("No")) {
				n=5;
			}
			
		}
		
		
		
		
		
		
			
		}

	}


