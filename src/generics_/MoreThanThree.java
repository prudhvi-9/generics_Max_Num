package generics_;

import java.util.Scanner;

/**
 * Generic Class.
 * 
 * @param <T>
 */
class MyPack<T> {
	T p, q, r, s, t, v;

	/**
	 * Constructor for generic class.
	 * 
	 */
	void add(T p, T q, T r, T s, T t, T v) {
		this.p = p;
		this.q = q;
		this.r = r;
		this.s = s;
		this.t = t;
		this.v = v;
	}

	/**
	 * To get value of p,q,r,s,t,v.
	 * 
	 * @return
	 */
	T getp() {
		return p;

	}

	T getq() {
		return q;
	}

	T getr() {
		return r;
	}

	T gets() {
		return s;

	}

	T gett() {
		return t;
	}

	T getv() {
		return v;
	}

	/**
	 * Comparing p,q,r,s,t,v to find maximum
	 * 
	 * @param <T>
	 * 
	 * @return
	 */
	public static <T extends Comparable<T>> T testermaximum(T p, T q, T r, T s, T t, T v) {
		T max = p;
		if (q.compareTo(max) > 0) {
			max = q;
		}
		if (r.compareTo(max) > 0) {
			max = r;
		}
		if (s.compareTo(max) > 0) {
			max = s;
		}
		if (t.compareTo(max) > 0) {
			max = t;
		}
		if (v.compareTo(max) > 0) {
			max = v;
		}

		printMaximumNumber(p, q, r, s, t, v, max);
		return max;
	}

	/**
	 * To print the data.
	 * 
	 * @param <T>
	 * 
	 * @param max
	 */
	public static <T> void printMaximumNumber(T p, T q, T r, T s, T t, T v, T max) {
		System.out.printf("Maximum of %s, %s,  %s, %s , %s, and %s is %s\n", p, q, r, s, t, v, max);

	}
}

/**
 * Main Class
 *
 *
 * @param <T>
 */
public class MoreThanThree<T extends Comparable<T>> {

	T a, b, c, d, e, f;

	/**
	 * Constructor.
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public MoreThanThree(T a, T b, T c, T d, T e, T f) {

		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;

	}

	public T maximum() {
		return MoreThanThree.maximum(a, b, c, d, e, f);
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
	public static <T> void printMaximumNum(T a, T b, T c, T d, T e, T f, T max) {
		System.out.printf("Maximum of %s, %s , %s, %s, %s and %s is %s\n", a, b, c, d, e, f, max);

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
	public static <T extends Comparable<T>> T maximum(T a, T b, T c, T d, T e, T f) {
		T max = a;
		if (b.compareTo(max) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		if (d.compareTo(max) > 0) {
			max = d;
		}
		if (e.compareTo(max) > 0) {
			max = c;
		}
		if (f.compareTo(max) > 0) {
			max = c;
		}

		printMaximumNum(a, b, c, d, e, f, max);
		return max;
	}

	/*
	 * To Compare String.
	 */
	public static String testingmaximum(String a, String b, String c, String d, String e, String f) {
		String max = a;
		if (b.compareTo(max) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		printMaximumNum(a, b, c, d, e, f, max);
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

		System.out.println("-----------------------------------\nInteger Values:");
		System.out.println("Enter value of a:");
		Integer aIn = cs.nextInt();
		System.out.println("Enter value of b:");
		Integer bIn = cs.nextInt();
		System.out.println("Enter value of c:");
		Integer cIn = cs.nextInt();
		System.out.println("Enter value of d:");
		Integer dIn = cs.nextInt();
		System.out.println("Enter value of e:");
		Integer eIn = cs.nextInt();
		System.out.println("Enter value of f:");
		Integer fIn = cs.nextInt();

		System.out.println("-------------------------------------\nFloat Values:");
		System.out.println("Enter value of a:");
		Float aFl = cs.nextFloat();
		System.out.println("Enter value of b:");
		Float bFl = cs.nextFloat();
		System.out.println("Enter value of c:");
		Float cFl = cs.nextFloat();
		System.out.println("Enter value of d:");
		Float dFl = cs.nextFloat();
		System.out.println("Enter value of e:");
		Float eFl = cs.nextFloat();
		System.out.println("Enter value of f:");
		Float fFl = cs.nextFloat();
		System.out.println("--------------------------------------\nString:");

		System.out.println("Enter value of a:");
		String aStri = cs.next();
		System.out.println("Enter value of b:");
		String bStri = cs.next();
		System.out.println("Enter value of c:");
		String cStri = cs.next();
		System.out.println("Enter value of d:");
		String dStri = cs.next();
		System.out.println("Enter value of e:");
		String eStri = cs.next();
		System.out.println("Enter value of f:");
		String fStri = cs.next();
		System.out.println("---------------------------------------\nBy Using Generic Class");

		/**
		 * Calling Genric class.
		 */
		MyPack<Integer> m = new MyPack<Integer>();
		System.out.println("Enter value of p:");
		Integer pIn = cs.nextInt();
		System.out.println("Enter value of q:");
		Integer qIn = cs.nextInt();
		System.out.println("Enter value of r:");
		Integer rIn = cs.nextInt();
		System.out.println("Enter value of s:");
		Integer sIn = cs.nextInt();
		System.out.println("Enter value of t:");
		Integer tIn = cs.nextInt();
		System.out.println("Enter value of v:");
		Integer vIn = cs.nextInt();
		System.out.println("----------------------------------------");
		m.add(pIn, qIn, rIn, sIn, tIn, vIn);

		MoreThanThree.testingmaximum(aStri, bStri, cStri, dStri, eStri, fStri);
		new MoreThanThree(aIn, bIn, cIn, dIn, eIn, fIn).maximum();
		new MoreThanThree(aFl, bFl, cFl, dFl, eFl, fFl).maximum();
		MyPack.testermaximum(m.p, m.q, m.r, m.s, m.t, m.v);
		cs.close();

	}
}
