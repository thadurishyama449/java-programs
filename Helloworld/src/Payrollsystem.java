interface Payable {
    double calculatePay();   // Contract: every Payable must know its pay
    void processPay();
}

class Employee2 implements Payable {
    double salary;
    Employee2(double salary){ this.salary=salary;}
    @Override
    public double calculatePay() { return salary / 12; }
    @Override
    public void processPay() { 
        System.out.println("Crediting Rs." + calculatePay() + " to account"); 
    }
}

class Freelancer implements Payable {
    double hoursWorked, hourlyRate;
    Freelancer(double hoursWorked, double hourlyRate){
    	this.hoursWorked=hoursWorked;
    	this.hourlyRate=hourlyRate;
    }
    @Override
    public double calculatePay() { return hoursWorked * hourlyRate; }
    @Override
    public void processPay() {
        System.out.println("Paying Rs." + calculatePay() + " as contract fee");
    }
}

// POLYMORPHISM via interface — key power!
public class Payrollsystem {
    public static void main(String[] args) {
        Payable[] staff = { new Employee2(25000), new Freelancer(20,1500) };
        for (Payable p : staff) {
            p.processPay();   // Works for ALL Payable types!
        }
    }
}