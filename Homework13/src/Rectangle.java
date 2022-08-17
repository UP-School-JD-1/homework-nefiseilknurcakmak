
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

}
	
	
	