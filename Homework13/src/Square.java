import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(side);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Square other = (Square) obj;
		return Double.doubleToLongBits(side) == Double.doubleToLongBits(other.side);
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
	
}
	
