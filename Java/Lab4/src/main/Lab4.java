package main;

public class Lab4 {
	/**
	 * Lab 4A: Algebra explained in Java.
	 * 
	 * @author DarknesGaming
	 */
	public static void main(String args[]) {
		//identifier set up and assignment
		/**
		 * You should already know what these double values are. For this lab to
		 * work, do NOT remove these.
		 */
		double w = 10.0;
		double x = 5.0;
		double y = 77.77;
		double z = 1.21;
		
		// Identify the program that shall run!
		System.out.println("Lab 04A, 100 Point Version");
		System.out.println();
		
		// Calculations and output
		/**
		 * Here, new double variables are created and called by output methods from
		 * the square root of a number.
		 */
		double s1 = Math.sqrt(25);
		System.out.println("s1 = " + s1);
		double s2 = Math.sqrt(100);
		System.out.println("s2 = " + s2);
		double s3 = Math.sqrt(3);
		System.out.println("s3 = " + s3);
		double s4 = Math.sqrt(x);
		System.out.println("s4 = " + s4);
		double s5 = Math.sqrt(y);
		System.out.println("s5 = " + s5);
		double s6 = Math.sqrt(x+y);
		System.out.println("s6 = " + s6);
		double s7 = Math.sqrt(x*y);
		System.out.println("s7 = " + s7);
		System.out.println();
		
		// Absolute value
		/**
		 * This is an Algebra II topic. For absolute value, both the positive and the
		 * negative number (like 7 and -7) have the same number that they use (which
		 * is 7).
		 */
		double a1 = Math.abs(7);
		System.out.println("a1 = " + a1);
		double a2 = Math.abs(-7);
		System.out.println("a2 = " + a2);
		double a3 = Math.abs(7) * -1;
		System.out.println("a3 = " + a3);
		double a4 = Math.abs(y - z);
		System.out.println("a4 = " + a4);
		double a5 = Math.abs(z - y);
		System.out.println("a5 = " + a5);
		double a6 = Math.abs((y - z)) * -1;
		System.out.println("a6 = " + a6);
		System.out.println();
		
		// Power
		/**
		 * For the power method, the first number is the number that you will start
		 * with, and the second number is what you will raise the number by.
		 * Example: 7 to the second power would be 49. 7 to the third power would be
		 * 343 (not a reference to 343 Industries).
		 */
		double p1 = Math.pow(7, 2);
		System.out.println("p1 = " + p1);
		double p2 = Math.pow(2, 7);
		System.out.println("p2 = " + p2);
		double p3 = Math.pow(z, 3);
		System.out.println("p3 = " + p3);
		double p4 = Math.pow(3, z);
		System.out.println("p4 = " + p4);
		double p5 = Math.pow(w, x);
		System.out.println("p5 = " + p5);
		double p6 = Math.pow(x, w);
		System.out.println("p6 = " + p6);
		double p7 = Math.pow(-1*x, 2);
		System.out.println("p7 = " + p7);
		double p8 = Math.pow(w, -1);
		System.out.println("p8 = " + p8);
		double p9 = Math.pow(w, -2);
		System.out.println("p9 = " + p9);
		System.out.println();
		
		// Rounding
		/**
		 * This is more of an elementary school topic. Here, the number is rounded
		 * to the nearest integer.
		 * For the "floor" method, the number is rounded down, regardless if the number
		 * is ".5". That number will be ronded down to 0.
		 * For the "ceil" method, the number is rounded up, regardless if the number is
		 * ".4999". The number will be rounded up to 1.
		 */
		double r1 = Math.round(2.4999);
		System.out.println("r1 = " + r1);
		double r2 = Math.round(2.5);
		System.out.println("r2 = " + r2);
		double r3 = Math.round(2.0001);
		System.out.println("r3 = " + r3);
		double r4 = Math.floor(2.9999);
		System.out.println("r4 = " + r4);
		double r5 = Math.ceil(2.0001);
		System.out.println("r5 = " + r5);
		double r6 = Math.round(2.9999);
		System.out.println("r6 = " + r6);
		System.out.println();
		
		// Minimum/Maximum
		/**
		 * Here, the "max" and "min" method have opposite meanings. The "max" method
		 * will output the maximum number it can find in the two numbers it gets. The
		 * "min" method will output the minimum number it can find in the two numbers
		 * it gets.
		 */
		double m1 = Math.max(4, 6);
		System.out.println("m1 = " + m1);
		double m2 = Math.min(-4, -6);
		System.out.println("m2 = " + m2);
		double m3 = Math.max(w, x);
		System.out.println("m3 = " + m3);
		double m4 = Math.min(y, z);
		System.out.println("m4 = " + m4);
		double m5 = Math.max(Math.PI, Math.E);
		System.out.println("m5 = " + m5);
		System.out.println();
		
		// Complicated Problems
		/**
		 * These are more complex problems of what you've seen from this lab. Try to
		 * figure this out before we go on to your first challenge. For best results,
		 * it's best to use an IDE to get this done. I recommend Eclipse.
		 */
		double c1 = Math.sqrt(Math.abs(-65536));
		System.out.println("c1 = " + c1);
		double c2 = Math.sqrt(Math.sqrt(65536));
		System.out.println("c2 = " + c2);
		double c3 = Math.sqrt(Math.sqrt(Math.sqrt(65536)));
		System.out.println("c3 = " + c3);
		double c4 = Math.sqrt(Math.sqrt(Math.sqrt(Math.sqrt(65536))));
		System.out.println("c4 = " + c4);
		double c5 = Math.max(Math.pow(3, 4), Math.pow(4, 3));
		System.out.println("c5 = " + c5);
		double c6 = Math.min(Math.pow(w, x), Math.pow(x, w));
		System.out.println("c6 = " + c6);
		long c7 = (long) (Math.PI * 100000.0);
		Math.round(c7);
		double c8 = c7 / 100000.0;
		System.out.println("c7 = " + c8);
		
		
		System.out.println();
	}
}
