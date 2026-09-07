interface Shape4{
	void draw();
	default void fill() {
		System.out.println("Filling");
	}
}
class Circle4 implements Shape4{
	public void draw() {
		System.out.println("Drawing a Circle");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape4 s = new Circle4();
		s.draw();
		s.fill();

	}

}