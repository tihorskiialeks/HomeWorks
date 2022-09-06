package ua.kh.tykhorskyi.hw.figures;

public class FigureTest {

	public static void main(String[] args) {

		Figure fig1 = new Rectangle(5, 6, 10, 6, 3);
		Figure fig2 = new Triangle(3, 4, 5, 4, 6);
		Figure fig3 = new Circle(3, 4, 5);
		Figure fig5 = new Circle(4, 5, 7);

		Figure[] figure = new Figure[3];
		figure[0] = new Rectangle(4, 4, 5, 4, 0);
		figure[1] = new Triangle(3, 5, 3, 3, 5);
		figure[2] = new Circle(5, 7, 15);
		for (Figure f : figure) {
			System.out.println(f);
		}
		System.out.println(" ");

		fig1.print();
		fig1.area();
		fig1.scale(2);
		fig1.move(3, 5);

		fig1.print();

		System.out.println("");
		fig2.print();
		fig2.area();
		fig2.scale(2);
		fig2.move(3, 5);
		fig2.print();
		System.out.println("");

		fig3.print();
		System.out.println("Is the dot inside the circle? " + fig3.isInside(3, 5));
		System.out.println("Is the circle1 inside the circle? " + fig3.isInside((Circle) fig5));
		fig3.area();
		fig3.scale(2);
		fig3.move(4, 6);
		fig3.print();

		System.out.println("Is the dot inside the circle? " + fig3.isInside(3, 5));
		System.out.println("Is the circle1 inside the circle? " + fig3.isInside((Circle) fig5));

	}

}
