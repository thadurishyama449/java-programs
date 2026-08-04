class Employee{
	int empNum;
	String empName;
	double empSalary;
	Employee(){}
	/*void setEmpDetails(int num,String name,double sal)
	{
		this.empNum=empNum;
		this.empName=empName;
		this.empSalary=empSalary;
	}*/
	Employee(int empNum,String empName){
		this.empNum=empNum;
		this.empName=empName;
	}
	Employee(int empNum,String empName,double empSalary){
		this(empNum,empName);
		this.empSalary=empSalary;
	}
	void disEmpDetails()
	{
		System.out.println("Employee No: "+empNum+"Employee Name: "+empName+"Salary: "+empSalary);
		
	}
 }
	public class EmployeeDemo{
		public static void main(String[] args) {
			Employee e1=new Employee();
			e1.disEmpDetails();
			Employee e2=new Employee(101,"Rani")	;
			e2.disEmpDetails();
			Employee e3=new Employee(102,"Lahari",500000);
			e3.disEmpDetails();
			
			
		}
	}