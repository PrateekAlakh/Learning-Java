package assignment_1;

/*Write a program to check for greatest of 3 numbers using ternary operator. Use Scanner to get user input.*/

import java.util.Scanner;

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter Three Values : ");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt(); //First Value
		int n2 = sc.nextInt(); //Second Value
		n1 = n2>n1?n2:n1;
		n2 = sc.nextInt(); //Third Value
		n1 = n2>n1?n2:n1;
		System.out.println("Maximum Value = "+n1);
		sc.close();
	}

}
