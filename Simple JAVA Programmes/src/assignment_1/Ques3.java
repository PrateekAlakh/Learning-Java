package assignment_1;

/*Write a program to check for greatest of 3 numbers using &&. Use scanner to get user input*/

import java.util.Scanner;

public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1,n2,n3;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		if(n1>=n2 && n1>=n3) {
			System.out.println("Maximum Value = "+n1);
		}else if(n2>=n3) {
			System.out.println("Maximum Value = "+n2);
		}else {
			System.out.println("Maximum Value = "+n3);
		}
		sc.close();
	}

}
