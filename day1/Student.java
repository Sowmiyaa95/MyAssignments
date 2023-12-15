package week1.day1;

public class Student {
public void report() {
	String studentName = "Sowmiyaa";
	int rollNo = 1234;
    String collegeName = "AU";
	float markScored = 95.5f;
	float cgpa = 9.6f;
	
	System.out.println("The student name is "+studentName);
	System.out.println("The roll no is "+rollNo);
	System.out.println("College Name is "+collegeName);
	System.out.println("Mark Scored is "+markScored);
	System.out.println("CGPA is "+cgpa);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student();
		obj.report();
	}

}
