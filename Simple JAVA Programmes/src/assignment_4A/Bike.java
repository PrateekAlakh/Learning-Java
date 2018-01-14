package assignment_4A;

public class Bike extends Vehicle {
	int enginePower;
	public Bike(String model, double price, String name, int enginePower) {
		super(model, price, name);
		// TODO Auto-generated constructor stub
		this.enginePower=enginePower;
	}
	public void getDetails() {
		super.getDetails();
		System.out.println("Engine Power : "+enginePower+"L");
	}
}
