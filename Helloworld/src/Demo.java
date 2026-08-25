class A1{
	int a=10,b=20;
    public String toString() {
		return a+" Class A "+b;
	}
}
public class Demo {
    public static void main(String[] args) {
    	A1 a1=new A1();
    	A1 a2=new A1();
    	System.out.println(a1+" : "+a2);
    }
 }
