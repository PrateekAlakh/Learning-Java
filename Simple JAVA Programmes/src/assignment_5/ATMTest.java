package assignment_5;

import java.util.Scanner;

public class ATMTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose Account Type\nEnter 1 for Savings\nEnter 2 for Current");
		int ch = sc.nextInt();
		Account a=null;
		if(ch==1) {
			a = new Savings(1000);
		}else if(ch==2) {
			a = new Current(1000);
		}
		int k=1;
		do {
			System.out.println("Enter 1 to Withdraw\nEnter 2 to Deposit\nEnter 3 to Know Account Balance\nEnter Your Choice :");
			k=sc.nextInt();
			switch(k) {
				case 1:
					System.out.println("Enter Amount to Withdraw");
					int am = sc.nextInt();
					a.withdraw(am);
					break;
				case 2:
					System.out.println("Enter Amount to Deposit");
					am = sc.nextInt();
					a.deposit(am);
					break;
				case 3:
					System.out.println("Account Balance : "+a.getBalance());
					break;
				case 4:
					System.out.println("Session Closed");
					break;
				default:
					System.out.println("Wrong Input Try Again");
			}
		}while(k!=4);
		sc.close();
	}

}
