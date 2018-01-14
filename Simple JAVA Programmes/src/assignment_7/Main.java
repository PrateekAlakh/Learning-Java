package assignment_7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m1 = new Mobile();
		Mobile m2 = new Mobile();
		
		m1.setName("Galaxy");
		m1.setBrand("Samsung");
		m1.setPrice(20000);
		
		m2.setName("iPhone");
		m2.setBrand("Apple");
		m2.setPrice(40000);
		
		System.out.println(m1+"\n"+m2);
	}

}
