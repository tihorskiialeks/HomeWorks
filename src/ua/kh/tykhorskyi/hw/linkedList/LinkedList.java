package ua.kh.tykhorskyi.hw.linkedList;


public class LinkedList {
	private Item head;
	private Item tail;

	public LinkedList(int data) {
		this.head = new Item(data, null);
		this.tail = head;
	}

	public void add(int data) {
		Item temp = new Item(data, null);
		tail.setNext(temp);
		tail = tail.getNext();
	}

	public void add(int data, int index) {
		Item list = head;
		for (int i = 1; i < index - 1; i++) {
			list = list.getNext();
		}
		list.setNext(new Item(data, list.getNext()));
	}

	public void delete(int index) {
		Item list = head;
		for (int i = 1; i < index - 1; i++) {
			list = list.getNext();
		}
		list.setNext(list.getNext().getNext());
	}

	public void print() {
		Item list = head;
		while (list != null) {
			System.out.printf("%d ", list.getNumber());
			list = list.getNext();
		}
	}

	public void print(int index) {
		Item list = head;
		for (int i = 1; i < index; i++) {
			list = list.getNext();
		}
		System.out.println(list.getNumber());
	}

	public void clean() {
		head = new Item(0, null);
	}
}
