package ua.kh.tykhorskyi.hw.linkedList;

/*
 * Done 1) очистить весь список;
Done 2) добавить элемент в список;
Done 3) Получить j-й элемент;
Done 4) Удалить j-й элемент;
Done 5) вывести значения списка на экран.

Объявите класс, который реализует односвязный рекурсивный список строк (чисел, обьектов, чего угодно пока 🙂 ). 
Список представляется двумя полями: строкой и указателем на следующий элемент списка.
 В частном случае одноэлементного списка этот указатель равен null. Методы такие же как и у класса "Вектор".
 */
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

	/**
	 * the method which add element to the chosen place;
	 * 
	 * @param data  - element
	 * @param index - place to add
	 */
	// Этого в домашке не было, начал копаться, залез в лес, решил для практики тоже
	// сделать)
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
