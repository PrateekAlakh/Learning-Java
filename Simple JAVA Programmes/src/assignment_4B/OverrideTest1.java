package assignment_4B;

import java.util.Scanner;

public class OverrideTest1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape sh;
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose Shape\nEnter 1 for Rectangle\nEnter 2 for Triangle");
		int ch = sc.nextInt();
		if(ch==1) {
			sh = new Rectangle();
			System.out.println("Enter length and breadth");
			int l = sc.nextInt();
			int b = sc.nextInt();
			sh.area(l, b);
		}else {
			sh = new Triangle();
			System.out.println("Enter height and base");
			int h = sc.nextInt();
			int b = sc.nextInt();
			sh.area(h, b);
		}
		sc.close();
	}

}
