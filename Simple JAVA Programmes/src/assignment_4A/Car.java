package assignment_4A;

public class Car extends Vehicle{
	boolean rearAC;
	public Car(String model, double price, String name, boolean rearAC) {
		super(model, price, name);
		// TODO Auto-generated constructor stub
		this.rearAC=rearAC;
	}
	public void getLuxuryAccessories() {
		this.getDetails();
		if(rearAC)
			System.out.println("Rear AC Present\n");
		else
			System.out.println("Rear AC Absent\n");
	}

}
