package ua.kh.tykhorskyi.hw.ShopOfShips;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Shop shop = new Shop();
		String input = "";
		try (Scanner sc = new Scanner(System.in)) {
			while (!input.equals("0")) {
				System.out.println("1. Add new ship");
				System.out.println("2. Edit the data of ship");
				System.out.println("3. Remove the ship");
				System.out.println("4. Sort ships by price");
				System.out.println("5. Sort ships by name A-Z");
				System.out.println("6. Sort ships by name Z-A");
				System.out.println("7. Save ships in file");
				System.out.println("8. Read ships from file");
				System.out.println("9. Print list of Ships");
				System.out.println("0. Exit");
				input = sc.nextLine();
				if (input.equals("1")) {
					System.out.println("Enter name of ship ");
					String name = sc.nextLine();
					System.out.println("Enter Country");
					String country = sc.nextLine();
					System.out.println("Enter motor capacity");
					double motorCapacity = sc.nextDouble();
					System.out.println("Enter price");
					double price = sc.nextDouble();
					shop.add(new Ship(name, country, motorCapacity, price));
					sc.nextLine();
				} else if (input.equals("2")) {
					System.out.println("Enter the index of the ship to edit the data");
					int index = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter name of ship ");
					String name = sc.nextLine();
					System.out.println("Enter Country");
					String country = sc.nextLine();
					System.out.println("Enter motor capacity");
					double motorCapacity = sc.nextDouble();
					System.out.println("Enter price");
					double price = sc.nextDouble();
					shop.set(index, name, country, motorCapacity, price);

				} else if (input.equals("3")) {
					System.out.println("Enter the index of the ship to delete");
					int index = sc.nextInt();
					shop.delete(index);
				} else if (input.equals("4")) {
					System.out.println("Ships were sorted by price");
					shop.sortByPrice();
				} else if (input.equals("5")) {
					System.out.println("Ships were sorted by name A-Z");
					shop.sortByName();
				} else if (input.equals("6")) {
					System.out.println("Ships were sorted by name Z-A");
					shop.sortByNameBackwards();
				} else if (input.equals("7")) {
					if (shop.save("Menu_test")) {
						System.out.println("Ships were saved in file Menu_test");
					} else {
						System.out.println("ERROR. Ships were not saved in file");
					}
				} else if (input.equals("8")) {
					System.out.println("Enter the name of file to read Menu");
					String name = sc.nextLine();
					if (shop.read(name)) {
						System.out.println("Ships were read from file " + name);
					} else {
						System.out.println("ERROR. Ships were not read from file " + name);
					}
				} else if (input.equals("9")) {
					shop.print();
				}
			}
		}
	}
}
