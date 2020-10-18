package review;
import java.util.*;

public class MethodPractice1 {
	private Scanner scan = new Scanner(System.in);

	/**
	 * This method returns a string using the following conditions: if weight is
	 * less than 100 it returns "small", if weight is greater than or equal to 100
	 * and less than or equal to 200 it returns "medium", if weight is greater than
	 * 200 it returns "large".
	 * 
	 * @return the string "small", "medium", or "large"
	 * @param weight number representing a weight
	 */
	public String method1(int weight) {
		if (weight <= 100) {
			return "Weight is small";
		} else if (weight >= 100 && weight <= 200) {
			return "Weight is medium";
		} else {
			return "Weight is large";
		}
	}

	/**
	 * This method prints phrase 10 times. @ param phrase the string to be printed
	 */
	public void method2(String phrase) {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Give me liberty or give me death");
		}
	}

	/**
	 * This method allows a user to enter an unknown number of integers from the
	 * keyboard. When the sentinel value -1 is entered the method returns the count
	 * of the number of integers entered.
	 * 
	 * @return count of the number of integers entered
	 */
	public int method3() {
		System.out.print("Enter numbers and if you are done then type -1:\n");
		int add = 0;
		while(scan.nextInt() != -1) {
			add++;
		}
		return add;
	}

	/**
	 * This method returns a string containing the first and last letter of str
	 * concatenated together.
	 * 
	 * @return a string containing two letters
	 * @param str the string from which to extract the first and last letters
	 */
	public String method4(String str) {
		return str.substring(0,1) + str.substring(str.length()-1, str.length());
	}

	/**
	 * This method returns a random number.
	 * 
	 * @return a random number in range of 0 to upper-1
	 * @param upper the upper limit of the random number
	 */
	public int method5(int upper) {
		return (int)((Math.random() + 0) * upper);
	}

	public static void main(String[] args) {
		MethodPractice1 app = new MethodPractice1();

		System.out.println("******************");
		System.out.println("   Test Method1");
		System.out.println("******************");

		System.out.println("Weight is " + app.method1(150));
		System.out.println("Weight is " + app.method1(99));
		System.out.println("Weight is " + app.method1(200));
		System.out.println("Weight is " + app.method1(300));

		System.out.println("\n\n******************");
		System.out.println("   Test Method2");
		System.out.println("******************");
		app.method2("Computers are fun!");

		System.out.println("\n\n******************");
		System.out.println("   Test Method3");
		System.out.println("******************");
		System.out.println("\nCount = " + app.method3());

		System.out.println("\n\n******************");
		System.out.println("   Test Method4");
		System.out.println("******************");
		System.out.println("String = " + app.method4("red"));
		System.out.println("String = " + app.method4("green"));
		System.out.println("String = " + app.method4("blue"));

		System.out.println("\n\n******************");
		System.out.println("   Test Method5");
		System.out.println("******************");
		System.out.println("Random Number = " + app.method5(5));
		System.out.println("Random Number = " + app.method5(50));
		System.out.println("Random Number = " + app.method5(500));
		System.out.println();
	}
}