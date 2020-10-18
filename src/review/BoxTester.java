package review;
class Box {

	// Instance Variables

	private int side;

	// Constructors

	public Box(int side) {
		this.side = side;
	}

	// Methods

	/**
	 * precondition: none postcondition: calculates and returns the area of the box
	 * (A = 6 * side * side)
	 * 
	 * @return the area of the box
	 */

	public int calculateArea() {
		return 6 * side * side;
	}

	/**
	 * precondition: none postcondition: calculates and returns the volume of the
	 * box (V = side * side * side)
	 * 
	 * @return the volume of the box
	 */

	public int calculateVolume() {
		return side * side * side;
	}

}

public class BoxTester {
	public static void main(String[] args) {
		Box box1 = new Box(4); // instantiate box object
		System.out.println("  Box 1");
		System.out.println("=========");
		System.out.println("Area = " + box1.calculateArea());
		System.out.println("Volume = " + box1.calculateVolume());
		Box box2 = new Box(10);
		System.out.println("\n  Box 2");
		System.out.println("=========");
		System.out.println("Area = " + box2.calculateArea());
		System.out.println("Volume = " + box2.calculateVolume());

		Box box3 = new Box(150);
		System.out.println("\n  Box 3");
		System.out.println("=========");
		System.out.println("Area = " + box3.calculateArea());
		System.out.println("Volume = " + box3.calculateVolume());

	}

}
