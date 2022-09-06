package ua.kh.tykhorskyi.hw.linkedList;

public class Item {
	private int number;
	private Item next;

	public int getNumber() {
		return number;
	}

	public Item getNext() {
		return next;
	}

	public void setNext(Item next) {
		this.next = next;
	}

	public Item(int number, Item next) {
		this.number = number;
		this.next = next;
	}

}
