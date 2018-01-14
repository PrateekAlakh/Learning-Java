package assignment_3;

public class Employee {
	private int basicallowance = 1000;
	double calcBonus(int allowance) {//-->for programmer
		return allowance+basicallowance;
	}
	double calcBonus(int allowance,int carallow) {//-->for manager
		return basicallowance+allowance+carallow;
	}
	double calcBonus(int allowance,int carallow,int houseallow) {//-->for director
		return basicallowance+allowance+carallow+houseallow;
	}
}