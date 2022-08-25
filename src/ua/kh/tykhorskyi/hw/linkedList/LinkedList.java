package ua.kh.tykhorskyi.hw.linkedList;

public class LinkedList {
	private int number;
	private LinkedList next;

	public int getNumber() {
		return number;
	}

	public LinkedList getNext() {
		return next;
	}

	public void setNext(LinkedList next) {
		this.next = next;
	}

	public LinkedList(int number, LinkedList next) {
		this.number = number;
		this.next = next;
	}

}
