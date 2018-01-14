package assignment_1;

/*Create a program to display stars in any pattern.*/

public class QuesPattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print("\t");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*\t");
			}
			System.out.println();
		}
		
	}

}
