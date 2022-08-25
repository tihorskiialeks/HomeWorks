package ua.kh.tykhorskyi.hw.figures;

public abstract class Figure {
	protected int x;
	protected int y;

	public int getX() {

		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Figure() {
	}

	public Figure(int x, int y) {// constructor with parameters
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "x coordinate = " + x + " " + "y coordinate = " + y;
	}

//		
	public void move(int horizontCoef, int vertucalCoef) {
		x = x + horizontCoef;
		y = y + vertucalCoef;
	}

	public boolean isDotInCircle(double x1, double y1) {
		return false;
	}

	public boolean isCircleInCircle(Circle circle) {
		return false;
	}

	public abstract void scale(int coef);

	public abstract double area();

	public void print() {
		System.out.println(this);
	}

}