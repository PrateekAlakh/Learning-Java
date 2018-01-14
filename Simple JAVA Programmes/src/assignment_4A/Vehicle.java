package assignment_4A;

public abstract class Vehicle {
	String model,name;
	double price;
	public Vehicle(String model,double price,String name) {
		this.model=model;
		this.name=name;
		this.price=price;
	}
	public void getDetails() {
		System.out.println("Model : "+this.model+"\nName : "+this.name+"\nPrice : "+this.price);
	}
}
