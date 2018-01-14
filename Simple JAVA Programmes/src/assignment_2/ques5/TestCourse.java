package assignment_2.ques5;

import java.util.Scanner;

public class TestCourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course [] courselist = new Course[4];
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int i=0;i<4;i++) {
			String name = sc.next();
			double duration = sc.nextDouble();
			double fees = sc.nextDouble();
			courselist[i] = new Course(name,duration,fees);
		}
		System.out.println(""+courselist[0] + courselist[1] + courselist[2] + courselist[3]);
		sc.close();
	}

}
