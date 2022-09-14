package ua.kh.tykhorskyi.hw.ShopOfShips;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.imageio.stream.FileImageInputStream;

public class Shop {
	private static final String SEPARATOR = "\n";
	protected ArrayList<Ship> ships;

	public ArrayList<Ship> getShips() {
		return ships;
	}

	public Shop() {
		ships = new ArrayList<Ship>();
	}

	@Override
	public String toString() {
		return "Shop [ships=" + ships + "]";
	}

	public void print() {
		System.out.println(this);
	}

	public void add(Ship ship) {
		ships.add(ship);
	}

	public void delete(Ship ship) {
		ships.remove(ship);
	}

	public void delete(int index) {
		ships.remove(index);
	}

	public void set(int index, String name, String country, double motorCapacity, double price) {
		ships.set(index, new Ship(name, country, motorCapacity, price));

	}

	public boolean saveByByte(String path) {
		return saveByByte(new File(path));
	}

	private boolean saveByByte(File file) {
		try (DataOutputStream fos = new DataOutputStream(new FileOutputStream(file))) {
			fos.write(String.valueOf(ships.size()).getBytes());
			fos.write(SEPARATOR.getBytes());
			for (Ship ship : ships) {
				fos.write(ship.getName().getBytes());
				fos.write(SEPARATOR.getBytes());
				fos.write(ship.getCountry().getBytes());
				fos.write(SEPARATOR.getBytes());
				fos.write(String.valueOf(ship.getMotorCapacity()).getBytes());
				//fos.writeDouble(ship.getMotorCapacity());
				fos.write(SEPARATOR.getBytes());
				fos.write(String.valueOf(ship.getPrice()).getBytes());
				fos.write(SEPARATOR.getBytes());
			}
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public boolean save(String path) {
		return save(new File(path));
	}

	private boolean save(File file) {
		try (FileWriter writer = new FileWriter(file)) {
			writer.write(ships.size() + SEPARATOR);
			for (Ship ship : ships) {
				writer.write(ship.getName());
				writer.write(SEPARATOR);
				writer.write(ship.getCountry());
				writer.write(SEPARATOR);
				writer.write("" + ship.getMotorCapacity());
				writer.write(SEPARATOR);
				writer.write("" + ship.getPrice());
				writer.write(SEPARATOR);
				writer.write(SEPARATOR);
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean readByByte(String path) {
		return readByByte(new File(path));
	}

	public boolean readByByte(File file) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
			String count = br.readLine();
			for (int i = 0; i < Integer.valueOf(count); i++) {
				String name = br.readLine();
				String country = br.readLine();
				double motorCapacity = Double.valueOf(br.readLine());
				double price = Double.valueOf(br.readLine());
				// String separator = br.readLine();
				ships.add(new Ship(name, country, motorCapacity, price));
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean read(String path) {
		return read(new File(path));
	}

	public boolean read(File file) {
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String count = reader.readLine();
			for (int i = 0; i < Integer.valueOf(count); i++) {
				String name = reader.readLine();
				String country = reader.readLine();
				double motorCapacity = Double.valueOf(reader.readLine());
				double price = Double.valueOf(reader.readLine());
				String separator = reader.readLine();
				ships.add(new Ship(name, country, motorCapacity, price));
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void sortByPrice() {
		Collections.sort(ships);
	}

	public void sortByName() {
		ShipNameComparator comp = new ShipNameComparator();
		Collections.sort(ships, comp);
	}

	public void sortByNameBackwards() {
		ShipNameComparator comp = new ShipNameComparator();
		Collections.sort(ships, comp.reversed());
	}

	private class ShipNameComparator implements Comparator<Ship> {

		@Override
		public int compare(Ship o1, Ship o2) {
			return o1.getName().compareTo(o2.getName());
		}

	}

}
