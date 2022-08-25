package ua.kh.tykhorskyi.hw.figures;

public class Rectangle extends Figure {
	private double horSide;
	private double vertSide;

	public double getHorSide() {
		return horSide;
	}

	public void setHorSide(double horSide) {
		this.horSide = horSide;
	}

	public double getVertSide() {
		return vertSide;
	}

	public void setVertSide(double vertSide) {
		this.vertSide = vertSide;
	}

	public Rectangle() {
	}

	public Rectangle(int x, int y, double horSide, double vertSide, double koef) {
		super(x, y);
		this.horSide = horSide;
		this.vertSide = vertSide;
	}

	@Override
	public String toString() {
		return super.toString() + " gorizontal side = " + horSide + " " + "vertical side = " + vertSide;
	}

	@Override
	public void scale(int koef) {
		horSide = horSide * koef;
		vertSide = vertSide * koef;
		
	}

	@Override
	public double area() {
		double area = horSide * vertSide;
		return area;

	}

}
