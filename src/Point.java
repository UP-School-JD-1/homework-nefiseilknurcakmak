
public class Point {

	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		return;
	}

	public int getX() {
		return x;
	}

	public int setX(int x) {
		return this.x = x;
	}

	public int getY() {
		return y;
	}

	public int setY(int y) {
		return this.y = y;
	}
	
	
	

	public String getInfoPoint() {

		return "(" + getX() + "," + this.getY() + ")";
	}

	
	
	
	double distancetotheorigin;

	public double calculateDistanceToTheOrigin() {
		return this.distancetotheorigin = Math.sqrt((this.x * this.x) + (this.y * this.y));

	}
	
	
	

	double distancetoanotherpoint;

	public double calculateDistanceToAnotherPoint(int a, int b) {

		return distancetoanotherpoint = Math.sqrt(Math.pow((this.x - a), 2) + Math.pow((this.y - b), 2));
	}

	
	
	String pointmoved;

	public String move(int c, int d) {
		int x = this.x + c;
		int y = this.y + d;
		this.pointmoved = "(" + x + "," + y + ")";
		return this.pointmoved;
	}


	public Point clone () {
		System.out.println("Point that cloned is "+ getInfoPoint());
	return new Point(getX(),getY());}

	
	
	
	
	
}
		
		
		

	
		
	