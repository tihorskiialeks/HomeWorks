package ua.kh.tykhorskyi.hw.figures;

public class Triangle extends Figure {
	private double side1;
	private double side2;
	private double side3;

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	public Triangle() {
	}

	public Triangle(int x, int y, double side1, double side2, double side3) {
		super(x, y);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public String toString() {
		return super.toString() + " first side = " + side1 + " " + "second side = " + side2 + " third side = " + side3;
	}

	@Override
	public void scale(int koef) {
		side1 = side1 * koef;
		side2 = side2 * koef;
		side3 = side3 * koef;
	}

	@Override
	public double area() {
		double p = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
		return area;

	}

}
