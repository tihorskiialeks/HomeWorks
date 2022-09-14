package ua.kh.tykhorskyi.hw.ShopOfShips;

public class ShopTest {

	public static void main(String[] args) {
		Shop shop = new Shop();
		Ship norwayFirst = new Ship("NorwayFirst", "Norway", 200.1, 35000);
		shop.add(norwayFirst);
//		for (int i = 0; i < 100000; i++) {
		shop.add(new Ship("Beda", "Russia", 450.1, 10000));
//		}
		shop.add(new Ship("Queen Victory", "Great Britain", 1000.34, 5_934_560));
		shop.add(new Ship("Saint Germain", "Germany", 800.2, 3_345_123));
		shop.add(new Ship("Francisco Mimbelli", "Italy", 600.20, 1_245_356));
		shop.print();
		shop.delete(1);
		shop.delete(norwayFirst);
		shop.sortByPrice();
//		System.out.println(shop.save("test"));
//		long timeSymbol = System.currentTimeMillis();
//		System.out.println(timeSymbol);
		System.out.println(shop.saveByByte("test1"));
//		long timeByte = System.currentTimeMillis();
//		System.out.println(timeByte);
//		System.out.println("difference = " + (timeSymbol - timeByte) + "ms");
		shop.print();
		Shop shop1 = new Shop();
		Shop shop2 = new Shop();
		System.out.println(shop1.read("test"));
		System.out.println(shop2.readByByte("test1"));
		shop1.print();
		shop2.print();

	}

}
