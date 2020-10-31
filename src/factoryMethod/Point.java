package factoryMethod;

public class Point {

	private double x, y;
	protected Point(double x, double y) {
		this.x = x;
		this.y = y;
		
		System.out.println(this.x);
	}

	public static Point newCartesianPoint(double x, double y) {
		return new Point(x, y);
	}

	public static Point newPolarPoint(double rho, double theta) {
		return new Point(rho * Math.cos(theta), rho * Math.sin(theta));
	}
}
