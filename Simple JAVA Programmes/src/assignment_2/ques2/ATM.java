package assignment_2.ques2;

import java.util.Scanner;

public class ATM {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new Bank();
		Scanner sc = new Scanner(System.in);
		int ch=4;
		do {
			System.out.println("Enter 1 to Withdraw Amount\nEnter 2 to Deposit Amount\nEnter 3 to View Balance\nEnter 4 to exit\nEnter your choice : ");
			ch = sc.nextInt();
			switch(ch) {
				case 1:
					System.out.println("Enter Amount to Withdraw");
					int amount = sc.nextInt();
					if(amount<=0) {
						System.out.println("\nTry Again\n");
						continue;
					}
					b.withdraw(amount);
					break;
				case 2:
					System.out.println("Enter Amount to Deposit");
					amount = sc.nextInt();
					if(amount<=0) {
						System.out.println("\nTry Again\n");
						continue;
					}
					b.deposit(amount);
					break;
				case 3:
					System.out.println("Account Balance = "+b.getBalance());
					break;
				case 4:
					break;
				default:
					System.out.println("\nTry Again Wrong Input\n");
					ch=0;
			}
		}while(ch<4);
		
		sc.close();
	}

}
