package assignment_1;

/*Write a program to check whether a particular name is available or not in a String array. In main method create a String array with 5 names. Get a name as user input and search in the array for the name. Use for each to iterate the array.*/

import java.util.Scanner;

public class Ques9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] names = {"prateek","meenakshi","mitul","prachi","pranita"};
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine().toLowerCase();
		boolean flag = true;
		for(String str:names) {
			if(str.equals(name)) {
				System.out.println("Found");
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("Not Found");
		}
		sc.close();
	}

}
