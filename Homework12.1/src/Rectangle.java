import java.util.Objects;

public class Rectangle extends Shape {

	double width;
	double length;

	public Rectangle(double width, double length) {
		this.length = length;
		this.width = width;
	}

	@Override
	void draw() {
		System.out.println("The rectangle has been drawn");
	}

	@Override
	void erase() {
		System.out.println("The rectangle has been erased");
	}

	@Override
	double calculateArea() {

		area = length * width;
		return super.calculateArea();

	}

	@Override
	double calculateCircumference() {
		circumfrence = 2 * (length + width);
		return super.calculateCircumference();
	}

	@Override
	public int hashCode() {
		return Objects.hash(length, width);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		return Double.doubleToLongBits(length) == Double.doubleToLongBits(other.length)
				&& Double.doubleToLongBits(width) == Double.doubleToLongBits(other.width);
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + "]";
	}

}
	