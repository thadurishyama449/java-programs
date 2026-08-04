class Employee{
	int empNum;
	String empName;
	double empSalary;
	void setEmpDetails(int num,String name,double sal)
	{
		empNum=num;
		empName=name;
		empSalary=sal;
	}
	void dispEmpDetails()
	{
		System.out.println("Employee No: "+empNum+"Employee Name: "+empName+"Salary: "+empSalary);
		
	}
 }
	public class EmployeeDemo{
		public static void main(String[] args) {
			Employee e1=new Employee();
			e1.dispEmpDetails();
			e1.setEmpDetails(101,"Bob",50000);
			e1.dispEmpDetails();
		}
	}