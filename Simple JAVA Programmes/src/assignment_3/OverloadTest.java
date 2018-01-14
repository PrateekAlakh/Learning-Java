package assignment_3;

import java.util.Scanner;

public class OverloadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Programmer\nEnter 2 for Manager\nEnter 3 for Director\nEnter your choice : ");
		int ch = sc.nextInt();
		sc.close();
		int allowance = 1000,carallow=500,houseallow=500;
		if(ch==1) {
			System.out.println(e.calcBonus(allowance));
		}else if(ch==2) {
			System.out.println(e.calcBonus(allowance, carallow));
		}else if(ch==3) {
			System.out.println(e.calcBonus(allowance, carallow, houseallow));
		}else {
			System.out.println("Wrong Input Try Again");
		}
	}

}
