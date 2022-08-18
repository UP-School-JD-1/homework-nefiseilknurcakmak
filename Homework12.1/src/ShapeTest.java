
public class ShapeTest {

	public static void main(String[] args) {

		Rectangle rec1 = new Rectangle(3, 5);
		Rectangle rec2 = new Rectangle(3, 5);
		
		
		Triangle tri1 = new Triangle(3, 4., 5);
		Circle circle1 = new Circle(5);
		Square sqr1 = new Square(9);

		rec1.draw();
		rec1.calculateArea();
		rec1.calculateCircumference();
	    System.out.println(rec1.hashCode());
	    System.out.println(rec2.hashCode());
	    System.out.println(rec1.equals(rec2));
		rec1.erase();

		circle1.draw();
		circle1.calculateArea();
		circle1.calculateCircumference();
		circle1.erase();

		tri1.draw();
		tri1.calculateArea();
		tri1.calculateCircumference();
		tri1.erase();

		sqr1.draw();
		sqr1.calculateArea();
		sqr1.calculateCircumference();
		sqr1.erase();

	}
}