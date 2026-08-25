abstract class shape {
	String color;
	abstract double area();
	void display() {
		System.out.println("Color: " + color);
  }
}
class Circle extends shape {
	double radius;
	Circle(double radius){
		this.radius=radius;
	}
	double area() {
		return Math.PI* radius * radius;
	}
}
public class AbstractClass_Example {

	public static void main(String[] args) {
		Circle c=new Circle(12.50);
		c.color = "Red";
		System.out.println("Circle Area: "+c.area());
        c.display();
	}

}
