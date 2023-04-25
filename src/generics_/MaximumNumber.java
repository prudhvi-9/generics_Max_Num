package generics_;

import java.util.Scanner;

public class MaximumNumber<T extends Comparable<T>> {

	T a, b, c;

	/**
	 * Constructor.
	 * 
	 * @param a
	 * @param b
	 * @param c
	 */
	public MaximumNumber(T a, T b, T c) {

		this.a = a;
		this.b = b;
		this.c = c;
	}

	public T maximum() {
		return MaximumNumber.maximum(a, b, c);
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
	public static <T> void printMax(T a, T b, T c, T max) {
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
	public static <T extends Comparable<T>> T maximum(T a, T b, T c) {
		T max = a;
		if (b.compareTo(max) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		printMax(a, b, c, max);
		return max;
	}

	/**
	 * This method is created for finding the maximum number.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter value of a:");
		Float aFloat = cs.nextFloat();
		System.out.println("Enter value of b:");
		Float bFloat = cs.nextFloat();
		System.out.println("Enter value of c:");
		Float cFloat = cs.nextFloat();

		new MaximumNumber(aFloat, bFloat, cFloat).maximum();
		cs.close();
	}

}
