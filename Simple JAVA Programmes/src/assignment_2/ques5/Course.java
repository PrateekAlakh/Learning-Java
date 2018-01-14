package assignment_2.ques5;

public class Course {
	String  name;
	double duration,fees;
	public Course(String name, double duration, double fees) {
		this.name=name;
		this.duration=duration;
		this.fees=fees;
	}
	public String toString() {
		return "\nName : "+name+"\nDuration : "+duration+"\nFees : "+fees+"\n";
	}
}
