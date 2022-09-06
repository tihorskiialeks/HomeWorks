package ua.kh.tykhorskyi.hw.linkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList list1 = new LinkedList(12);
		list1.add(24);
		list1.add(113);
		list1.add(3000);
		list1.add(8000);
		list1.print();
		System.out.println();
		
		list1.print(1);
		
		list1.add(5, 2);
		list1.print();
		
		System.out.println();
		
		list1.delete(6);
		list1.print();
		
		System.out.println();
		list1.clean();
		list1.print();
		
	}

}
