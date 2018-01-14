package assignment_1;

/*Write a program to calculate the sum of three marks, calculate average and fix grade. Use Scanner and if.*/

import java.util.Scanner;

public class Ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter three marks : ");
		Scanner sc = new Scanner(System.in);
		double m1 = sc.nextDouble();
		double m2 = sc.nextDouble();
		double m3 = sc.nextDouble();
		double avg = (m1+m2+m3)/3;
		System.out.println("Total Marks : "+(m1+m2+m3)+"\nAverage Marks : "+avg);
		
		if(avg<=50) {
			System.out.println("Grade D : Fail");
		}else if(avg<=70) {
			System.out.println("Grade C");
		}else if(avg<=85) {
			System.out.println("Grade B");
		}else {
			System.out.println("Grade A");
		}
		sc.close();
	}

}
