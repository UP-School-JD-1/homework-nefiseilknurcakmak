
public class Circle extends Shape {
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	void draw() {
		System.out.println("The circle has been drawn");
	}

	@Override
	void erase() {
		System.out.println("The shape has been erased");
	}

	@Override
	double calculateArea() {

		area = radius * radius * Math.PI;
		return super.calculateArea();

	}

	@Override
	double calculateCircumference() {
		circumfrence = 2 * radius * Math.PI;
		return super.calculateCircumference();
	}

}
