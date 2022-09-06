package ua.kh.tykhorskyi.hw.figures;

public class Circle extends Figure {
	public static final double PI = 3.14;
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle() {

	}

	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}

	public String toString() {
		return super.toString() + " radius = " + radius;
	}

	@Override
	public void scale(int koef) {
		radius = radius * koef;
	}

	@Override
	public double area() {
		return PI * (radius * radius);
	}

	public boolean isDotInCircle(double x1, double y1) {
		if ((x - x1) * (x - x1) + (y - y1) * (y - y1) <= (radius * radius)) {
			return true;
		}
		return false;
	}

	public boolean isCircleInCircle(Circle circle) {
		if ((x - circle.x) * (x - circle.x) + (y - circle.y) * (y - circle.y)
				+ (circle.radius * circle.radius) <= (radius * radius)) {
			return true;
		}
		return false;
	}

}
