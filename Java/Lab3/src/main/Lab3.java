package main;

public class Lab3 {
	/**
	 * Lab 3: More math methods, and more complex equations.
	 * @author DarknesGaming
	 */
	public static void main(String args[]) {
		/**
		 * These double values are used for the complex equations. The equations are
		 * found under the first 2 output methods.
		 */
	double r = 10.0;
	double x = 5.0;
	double y = 77.77;
	double z = 1.21;
	/**
	 * As explained in Lab 2, any value that has been finalized CANNOT be changed.
	 * Anything that does try to change this will output an error and stop the
	 * program from either functioning properly or finishing all the executions.
	 */
	final double PI = 3.14159;
	
	// This will identify the program being run.
	System.out.println("Lab 03, 100 Point Version");
	System.out.println();
	
	// Here are the equations that will be executed when the program is run.
	double a1 = 2 * (x + 1);
	System.out.println("a1 = " + a1);
	double a2 = 2*x + 2*1;
	System.out.println("a2 = " + a2);
	System.out.println();
	double b1 = 3*(r + x);
	System.out.println("b1 = " + b1);
	double b2 = 3*r + 3*x;
	System.out.println("b2 = " + b2);
	System.out.println();
	double c1 = r*(x + y);
	System.out.println("c1 = " + c1);
	double c2 = r*x + r*y;
	System.out.println("c2 = " + c2);
	System.out.println();
	double d1 = 5*(y - 7.77);
	System.out.println("d1 = " + d1);
	double d2 = 5*y - 5*(7.77);
	System.out.println("d2 = " + d2);
	System.out.println();
	double e1 = z*(y - r);
	System.out.println("e1 = " + e1);
	double e2 = z*y - z*r;
	System.out.println("e2 = " + e2);
	System.out.println();
	double f1 = r*(x + y + z);
	System.out.println("f1 = " + f1);
	double f2 = r*x + r*y + r*z;
	System.out.println("f2 = " + f2);
	System.out.println();
	double g1 = r + x*y + z;
	System.out.println("g1 = " + g1);
	double g2 = (r + x)*(y + z);
	System.out.println("g2 = " + g2);
	System.out.println();
	double h1 = r - x*y - z;
	System.out.println("h1 = " + h1);
	double h2 = (r-x)*(y - z);
	System.out.println("h2 = " + h2);
	System.out.println();
	double j1 = r * x/y * z;
	System.out.println("j1 = " + j1);
	double j2 = (r * x) / (y * z);
	System.out.println("j2 = " + j2);
	System.out.println();
	double k1 = r - x/x - r;
	System.out.println("k1 = " + k1);
	double k2 = r-x / x-r;
	System.out.println("k2 = " + k2);
	System.out.println();
	double m1 = 1.0 / 2.0;
	System.out.println("m1 = " + m1);
	double m2 = 3.0 / 7.0;
	System.out.println("m2 = " + m2);
	System.out.println();
	double n1 = 2*(r + x) / 5;
	System.out.println("n1 = " + n1);
	double n2 = 2*r + x/5;
	System.out.println("n2 = " + n2);
	System.out.println();
	double p1 = 2*PI*r;
	System.out.println("p1 = " + p1);
	double p2 = PI*r*r;
	System.out.println("p2 = " + p2);
	
	
	System.out.println();
	}

}
