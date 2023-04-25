package generics_;

import java.util.Scanner;

public class MaximumString<T extends Comparable<T>> {

	String a, b, c;

	/**
	 * Constructor.
	 * 
	 * @param a
	 * @param b
	 * @param c
	 */
	public MaximumString(String a, String b, String c) {

		this.a = a;
		this.b = b;
		this.c = c;
	}

	public String maximum() {
		return MaximumString.maximum(a, b, c);
	}

	/**
	 * To print the data.
	 * 
	 * @param <T>
	 * @param a
	 * @param b
	 * @param c
	 * @param max
	 */
	public static <T> void printMaximum(T a, T b, T c, T max) {
		System.out.printf("max of %s, %s and %s is %s\n", a, b, c, max);

	}

	/**
	 * Comparing a,b,c to find maximum.
	 * 
	 * @param <T>
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static <T extends Comparable<T>> String maximum(String a, String b, String c) {
		String max = a;
		if (b.compareTo(max) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		printMaximum(a, b, c, max);
		return max;
	}

	/**
	 * This method is created for finding the maximum string.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter value of a:");
		String aString = cs.nextLine();
		System.out.println("Enter value of b:");
		String bString = cs.nextLine();
		System.out.println("Enter value of c:");
		String cString = cs.nextLine();

		new MaximumString(aString, bString, cString).maximum();
		cs.close();
	}

}
