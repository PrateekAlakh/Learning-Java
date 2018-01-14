package assignment_2.ques3;

public class Student {
	String name,id,city;
	public Student(String name,String id,String city) {
		this.name = name;
		this.id=id;
		this.city = city;
	}
	public void getDetails() {
		System.out.println("Student Details:\nName : "+this.name+"\nID : "+this.id+"\nCity : "+this.city+"\n");
	}
	public String getGrade(int [] marks) {
		int total=0;
		for(int mark:marks) {
			total+=mark;
		}
		double avg = ((double)total)/((double)marks.length);
		System.out.println("Total Marks = "+total+"\nAverage = "+avg);
		if(avg<=50) {
			return "F";
		}else if(avg<=60) {
			return "E";
		}else if(avg<=70) {
			return "D";
		}else if(avg<=80) {
			return "C";
		}else if(avg<=90) {
			return "B";
		}
		return "A";
	}
}
