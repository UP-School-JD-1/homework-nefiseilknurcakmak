import java.util.Objects;

public class Triangle extends Shape {

	double side1;
	double side2;
	double side3;

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	@Override
	void draw() {
		System.out.println("The triangle has been drawn");
	}

	@Override
	void erase() {
		System.out.println("The triangle has been erased");
	}

	@Override
	double calculateArea() {
		double u = (side1 + side2 + side3) / 2;
		area = Math.sqrt(u * (u - side1) * (u - side2) * (u - side3));

		return super.calculateArea();

	}

	@Override
	double calculateCircumference() {
		circumfrence = side1 + side2 + side3;
		return super.calculateCircumference();
	}

	@Override
	public int hashCode() {
		return Objects.hash(side1, side2, side3);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		return Double.doubleToLongBits(side1) == Double.doubleToLongBits(other.side1)
				&& Double.doubleToLongBits(side2) == Double.doubleToLongBits(other.side2)
				&& Double.doubleToLongBits(side3) == Double.doubleToLongBits(other.side3);
	}

	@Override
	public String toString() {
		return "Triangle [side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + "]";
	}

}

	
    
