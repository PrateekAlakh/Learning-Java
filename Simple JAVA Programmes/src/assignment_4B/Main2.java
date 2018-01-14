package assignment_4B;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 1 for Addition\nEnter 2 for Subtraction\nEnter 3 for Multiplication\nEnter your choice");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		Calculator cal;
		System.out.println("Enter 2 values :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		switch(ch) {
			case 1:
				cal = new Adder();
				cal.calculate(a, b);
				break;
			case 2:
				cal = new Subtractor();
				cal.calculate(a, b);
				break;
			case 3:
				cal = new Multiplier();
				cal.calculate(a, b);
				break;
		}
		sc.close();
	}

}
