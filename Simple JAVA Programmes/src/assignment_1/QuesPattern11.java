package assignment_1;

/*Write a program to create these pattern
1 22 333 4444

1 23 456 78910

1 12 123 1234*/

public class QuesPattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.print("\t");
		}

		System.out.println("\n");
		
		int c=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(c++);
			}
			System.out.print("\t");
		}

		System.out.println("\n");
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.print("\t");
		}
	}

}
