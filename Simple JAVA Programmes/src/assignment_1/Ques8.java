package assignment_1;

/*Write a program to check whether it is a weekday or weekend. use switch case with string*/

public class Ques8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String w = "ThUrSdAy";
		switch (w.toLowerCase()) {
			case "monday": 
			case "tuesday":
			case "wednesday":
			case "thursday":
			case "friday":
				System.out.println("Weekday");
				break;
			case "saturday":
			case "sunday":
				System.out.println("Weekend");
				break;
			default:
				System.out.println("Wrong Input");
		}
	}

}
