
class Student{
	int rollNum,mark1,mark2,mark3,totalMarks;
	String stuName;
	void setStuDetails(int rollNum,String stuName,int mark1,int mark2,int mark3) {
		this.rollNum=rollNum;
		this.stuName=stuName;
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}
	void calculateTotal() {
		this.totalMarks=mark1+mark2+mark3;
	}
	void displayStuDetails() {
		System.out.print("Student Details :\nRoll Number: "+rollNum+"\nName: "+stuName+"\nTotal Marks: "+totalMarks);
	}
	
}
public class StudentDemo {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setStuDetails(12,"shyam",95,97,98);
		s1.calculateTotal();
		s1.displayStuDetails();
		
	}

}