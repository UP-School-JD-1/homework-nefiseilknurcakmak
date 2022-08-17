
public class Square extends Shape {
	double side;

	public Square(double side) {
		this.side = side;

	}

	@Override
	void draw() {
		System.out.println("The square has been drawn");
	}

	@Override
	void erase() {
		System.out.println("The square has been erased");
	}

	double calculateArea() {
		area = side * side;
		return super.calculateArea();
	}

	double calculateCircumference() {
		circumfrence = 4 * side;
		return super.calculateCircumference();
	}

}
	
