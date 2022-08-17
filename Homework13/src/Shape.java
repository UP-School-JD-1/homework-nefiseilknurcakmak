
public class Shape {

	double circumfrence;
	double area;

	void draw() {
		System.out.println("The shape has been drawn");

	}

	void erase() {
		System.out.println("The shape has been erased");

	}

	double calculateArea() {
		System.out.println("Area of shape= " + area);

		return area;
	}

	double calculateCircumference() {
		System.out.println("Circumfrence of shape= " + circumfrence);
		return circumfrence;
	}
}
