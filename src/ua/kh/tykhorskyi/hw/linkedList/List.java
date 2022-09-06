package ua.kh.tykhorskyi.hw.linkedList;


public class List {
	private LinkedList head;
	private LinkedList tail;

	public List(int data) {
		this.head = new LinkedList(data, null);
		this.tail = head;
	}

	public void add(int data) {
		LinkedList temp = new LinkedList(data, null);
		tail.setNext(temp);
		tail = tail.getNext();
	}

	public void add(int data, int index) {
		LinkedList list = head;
		for (int i = 1; i < index - 1; i++) {
			list = list.getNext();
		}
		list.setNext(new LinkedList(data, list.getNext()));
	}

	public void delete(int index) {
		LinkedList list = head;
		for (int i = 1; i < index - 1; i++) {
			list = list.getNext();
		}
		list.setNext(list.getNext().getNext());
	}

	public void print() {
		LinkedList list = head;
		while (list != null) {
			System.out.printf("%d ", list.getNumber());
			list = list.getNext();
		}
	}

	public void print(int index) {
		LinkedList list = head;
		for (int i = 1; i < index; i++) {
			list = list.getNext();
		}
		System.out.println(list.getNumber());
	}

	public void clean() {
		head = new LinkedList(0, null);
	}
}
