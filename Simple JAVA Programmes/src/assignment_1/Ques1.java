package assignment_1;
/*Create a program to get 4 values from command line and calculate sum*/
public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1])+Integer.parseInt(args[2])+Integer.parseInt(args[3]));
		}catch(Exception exception) {
			System.out.println("Exception : " + exception);
		}
	}
}