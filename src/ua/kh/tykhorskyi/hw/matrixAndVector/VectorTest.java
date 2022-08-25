package ua.kh.tykhorskyi.hw.matrixAndVector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<Integer>();
		vec.add(1);
		vec.add(2);
		vec.add(3);
		vec.add(4);
		vec.add(5);
		vec.add(6);
		vec.add(7);
		vec.add(8);
		vec.add(9);
		vec.add(10);
		vec.add(11);

		vec.vectorToScreen();
		System.out.println(vec.getElement(0));
		vec.deleteElement(2);
		vec.vectorToScreen();
		vec.clear();
		vec.vectorToScreen();

		Vector<String> strVec = new Vector<String>();
		strVec.add("one");
		strVec.add("two");
		strVec.add("three");
		strVec.add("four");
		strVec.add("five");
		strVec.add("six");
		strVec.add("seven");
		strVec.add("eight");
		strVec.add("nine");
		strVec.add("ten");
		strVec.add("eleven");

		strVec.vectorToScreen();
		System.out.println(strVec.getElement(5));
		strVec.deleteElement(2);
		strVec.vectorToScreen();
		strVec.clear();
		strVec.vectorToScreen();
	}

}
