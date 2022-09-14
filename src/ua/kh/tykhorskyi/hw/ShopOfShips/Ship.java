package ua.kh.tykhorskyi.hw.ShopOfShips;

import java.util.Objects;

public class Ship implements Comparable<Ship> {
	private String name;
	private String country;
	private double motorCapacity;
	private double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public double getMotorCapacity() {
		return motorCapacity;
	}

	public void setMotorCapacity(double motorCapacity) {
		this.motorCapacity = motorCapacity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Ship() {
		this("Ghost ship", "insert data", 0.0, 0.0);
	}

	public Ship(String name, String country, double motorCapacity, double price) {
		this.name = name;
		this.country = country;
		this.motorCapacity = motorCapacity;
		this.price = price;
	}

	public String toString() {
		return "Ship name = " + name + ", country = " + country + ", motorCapacity = " + motorCapacity + ", price = "
				+ price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(country, motorCapacity, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ship other = (Ship) obj;
		return Objects.equals(country, other.country)

				&& Double.doubleToLongBits(motorCapacity) == Double.doubleToLongBits(other.motorCapacity)
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);

	}

	@Override
	public int compareTo(Ship o) {
		return (int) (this.getPrice() - o.getPrice());
	}

}
