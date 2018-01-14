package assignment_1;

/*Create a one dim array of int data type having 4 values. Populate it by getting user input from scanner. Find out the bigger number in this array*/

import java.util.Scanner;

public class Ques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = new int[4];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<4;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=1;i<4;i++) {
			if(a[0]<a[i]) {
				a[0]=a[i];
			}
		}
		System.out.println("Maximum Value = "+a[0]);
		sc.close();
	}

}
