package assignment_5;

public class Savings extends Account{

	public Savings(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(int x) {
		// TODO Auto-generated method stub
		if(balance>=x) {
			balance-=x;
			System.out.println("Transaction Successful");
		}else {
			System.out.println("Transaction Failed");
		}
	}

	@Override
	void deposit(int x) {
		// TODO Auto-generated method stub
		balance+=x;
		System.out.println("Transaction Successful");
	}

}
