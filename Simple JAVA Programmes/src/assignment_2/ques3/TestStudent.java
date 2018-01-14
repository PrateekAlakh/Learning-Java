package assignment_2.ques3;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Prateek","S001","New Delhi");
		Student s2 = new Student("Mitul","S002","Dehradun");
		int [] marks1 = new int[2];
		int [] marks2 = new int[2];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks for Student 1");
		marks1[0]=sc.nextInt();
		marks1[1]=sc.nextInt();
		System.out.println("Enter Marks for Student 2");
		marks2[0]=sc.nextInt();
		marks2[1]=sc.nextInt();
		
		s1.getDetails();
		String g = s1.getGrade(marks1);
		System.out.println("Grade : "+g+"\n");
		
		s2.getDetails();
		g = s2.getGrade(marks2);
		System.out.println("Grade : "+g+"\n");
		
		sc.close();
	}

}
