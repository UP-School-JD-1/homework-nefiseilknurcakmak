
public class PointTest {

	public static void main(String[] args) {

		Point point1=new Point(3,4);
		Point point2=new Point(4,5);
	
	System.out.println("Distance of " + point1.getInfoPoint() +" to  origin is " +  + point1.calculateDistanceToTheOrigin());
	System.out.println("Distance of " + point2.getInfoPoint() +" to  origin is " +  + point2.calculateDistanceToTheOrigin());
	
	System.out.println("Distance of " + point1.getInfoPoint() +" to " + point2.getInfoPoint()  +" is " + point1.calculateDistanceToAnotherPoint(4,5));
	
	System.out.println("Point moved to " +point1.move(-2, 3));
	
	System.out.println(point1.clone());
	
	}

}