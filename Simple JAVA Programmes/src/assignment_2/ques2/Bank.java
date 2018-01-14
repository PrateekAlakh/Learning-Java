package assignment_2.ques2;

public class Bank {
	private int balance;
	public void withdraw(int v) {
		if(balance-v<0) {
			System.out.println("Low Balance");
		}else {
			balance-=v;
			System.out.println("Transaction Successful");
		}
	}
	public void deposit(int v) {
		balance+=v;
		System.out.println("Transaction Successful");
	}
	public double getBalance() {
		return balance;
	}
}
