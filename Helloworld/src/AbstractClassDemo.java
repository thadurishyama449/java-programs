abstract class Shape{
	void display() {
		System.out.println("Shape base class");
		}
	abstract double area();
}

class Rectangle3 extends Shape{
	double l,b;
	Rectangle3(double l,double b){
	    this.l=l;
	    this.b=b;
	}
    double area() {
    	return l*b;
    }
 }
 class Circle2 extends Shape{
	 double r;
	 Circle2(double r){
		 this.r=r;
	 }
	 double area() {
		 return Math.PI*r*r;
	 }
}
 
public class AbstractClassDemo {

	public static void main(String[] args) {
		Rectangle3 r= new Rectangle3(12,24);
		System.out.println("Area of the Rectangle:"+r.area());
		Circle2 c= new Circle2(5);
		System.out.println("Area of the Circle : "+c.area());
		
		
		
	}

}
