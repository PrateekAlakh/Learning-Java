package assignment_5;

public abstract class Account {
	double balance;
	public Account(double balance) {
		this.balance = balance;
	}

	abstract void withdraw(int x);

    abstract void deposit(int x);
    
    public double getBalance() {
    	return this.balance;
    }
}
