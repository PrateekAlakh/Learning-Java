package assignment_1;

/*Use command line to populate a two dim array which has 2 rows and 2 columns*/

public class Ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[2][2];
		try{
			a[0][0]=Integer.parseInt(args[0]);
			a[0][1]=Integer.parseInt(args[1]);
			a[1][0]=Integer.parseInt(args[2]);
			a[1][1]=Integer.parseInt(args[3]);
		}catch(Exception e) {
			System.out.println("Exception : "+e);
		}
		System.out.println(a[0][0] + "\t" + a[0][1] + "\n" + a[1][0] + "\t" + a[1][1]);
	}

}
