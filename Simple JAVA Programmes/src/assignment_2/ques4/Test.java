package assignment_2.ques4;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("book1",100,"Prateek");
		Book b2 = new Book("book2",80,"Rajput");
		b1.getDetails();
		b2.getDetails();
		
		Scanner sc = new Scanner(System.in);
		int x=4;
		System.out.print("\nEnter Book Type java or jsp : "+ x++);
		System.out.print("\nEnter Book Type java or jsp : "+ x++);
		
		String s = sc.nextLine();
		b1.getAllBooks(s);
		sc.close();
	}

}
