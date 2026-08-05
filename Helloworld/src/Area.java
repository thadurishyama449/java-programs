import java.util.Scanner;
class Rectangle{
	double l,b;
	Rectangle(double l, double b){
		this.l=l;
		this.b=b;
	}
	double area() {
		return l*b;
	}
	
	
}
public class Area {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length & breadth:");
		double l=sc.nextDouble();
		double b=sc.nextDouble();
		Rectangle r=new Rectangle(l,b);
		System.out.println("Area of the rectangle :"+r.area());
		sc.close();
	}

}