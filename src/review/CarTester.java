package review;

class Car {

	// Constants

	public final double capacity = 22; // number of gallons the gas
	// tank can hold when full

	// Instance Variables

	private double startMiles;
	private double endMiles;
	private double gallons;

	// Constructors

	public Car(double startMiles, double endMiles, double gallons) {
		this.startMiles = startMiles;
		this.endMiles = endMiles;
		this.gallons = gallons;

	}

	// Methods

	/**
	 * precondition: gallons > 0 postcondition: calculates and returns the cars MPG
	 * 
	 * (miles per gallon) for the current odometer readings.
	 * 
	 * @return the car's MPG
	 */

	public double calculateMPG() {
		double miles = endMiles - startMiles;
		if (gallons > 0) {
			return miles / gallons;
		}
		return 0.0;
	}

	/**
	 * precondition: none postcondition: calculates and returns the number of miles
	 * the car can travel before its gas tank is empty.
	 * 
	 * @return number of miles car can travel before tank is empty
	 */

	public double milesToEmpty() {
		return (capacity - gallons) * calculateMPG();
	}

}

public class CarTester {
	public static void main(String[] args) {
		Car car1 = new Car(1000, 1450, 20); // instantiate Car object
		System.out.println("  Car 1");
		System.out.println("=========");
		System.out.printf("MPG = %.1f \n", car1.calculateMPG());
		System.out.printf("Miles to empty = %.1f \n", car1.milesToEmpty());

		Car car2 = new Car(15000, 15200, 12);
		System.out.println();
		System.out.println("  Car 2");
		System.out.println("=========");
		System.out.printf("MPG = %.1f \n", car2.calculateMPG());
		System.out.printf("Miles to empty = %.1f \n", car2.milesToEmpty());

		Car car3 = new Car(80000, 80727, 21);
		System.out.println();
		System.out.println("  Car 3");
		System.out.println("=========");
		System.out.printf("MPG = %.1f \n", car3.calculateMPG());
		System.out.printf("Miles to empty = %.1f \n", car3.milesToEmpty());
	}
}