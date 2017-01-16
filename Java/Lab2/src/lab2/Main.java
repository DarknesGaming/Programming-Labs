package lab2;

public class Main {
	/**
	 * 
	 * Lab 2: The Math program.
	 * 
	 * @author DarknesGaming
	 * 
	 */
	public static void main(String args[]) {
		/**
		 * These double variables have been initialized, and have a number assigned to 
		 * them. Because they are double values, that means they can have decimal points.
		 * Any double with the "final" keyword means they CANNOT be changed. Anything
		 * that tries to change the value will result in errors if placed under the lines
		 * they reside in.
		 */
		double a = 10.0;
		double b = 5.0;
		double c = 77.77;
		double d = 1.21;
		final double E = 2.718281828;
		final double PI = 3.14159;
		/**
		 * These double variables have no number assigned. The numbers can be defined by
		 * creating an equation for them or by copying double a, b, c, and d. The
		 * equations you can make can be found further down the code.
		 */
		double sum;
		double diff;
		double prod;
		double quot;
		double pow;
		/**
		 * This is the start of the output. If you look carefully, you will see variables
		 * in the output. The output method will just output whatever number that is
		 * stored within that variable.
		 */
		System.out.println("Lab 02, 100 Point Version");
		System.out.println("The value of a is       " + a);
		System.out.println("The value of b is       " + b);
		System.out.println("The value of c is       " + c);
		System.out.println("The value of d is       " + d);
		System.out.println("The value of e is       " + E);
		System.out.println("The value of PI is      " + PI);
		
		System.out.println();
		/**
		 * See the "sum" variable? You can use equations to assign the calculated number
		 * to that variable. You can always define new numbers to it every time you
		 * make a new equation, or just define a random number from the top of your
		 * head.
		 */
		sum = a + 1.5;
		System.out.println("a plus 1.5 equals       " + sum);
		sum = b + 23.45;
		System.out.println("b plus 23.45 equals     " + sum);
		sum = c + -33.33;
		System.out.println("c minus -33.33 equals   " + sum);
		sum = a + b;
		System.out.println("a plus b equals         " + sum);
		sum = d + E;
		System.out.println("d plus E equals         " + sum);
		sum = c + d;
		System.out.println("c plus d equals         " + sum);
		sum = PI + E;
		System.out.println("PI plus E equals        " + sum);
		sum = a + b + c + d;
		System.out.println("The sum of a thru d is  " + sum);
		sum = 1.1 + a + 2 + b + 3;
		System.out.println("1.1 + a + 2 + b + 3 is  " + sum);
		sum =  PI + E + 42.24;
		System.out.println("PI + E + 42.24 equals   " + sum);
		System.out.println();
		// Subtraction
		/**
		 * The "diff" variable and beyond are in the same scenario with the "sum"
		 * variable, but have different equations.
		 * For the "multiply" and "divide" functions, you use the "*" sign for
		 * multiplying and the "/" sign for dividing. The "%" sign can be used for
		 * getting the remainder of a number that has been divided (e.g. 5 % 2 = 1).
		 */
		diff = a - 1.5;
		System.out.println("a minus 1.5 equals      " + diff);
		diff = b - 2.345;
		System.out.println("b minus 2.345 equals    " + diff);
		diff = c - -33.33;
		System.out.println("c minus -33.33 equals   " + diff);
		diff = a - b;
		System.out.println("a minus b equals        " + diff);
		diff = d - E;
		System.out.println("d minus E equals        " + diff);
		diff = c - d;
		System.out.println("c plus d equals         " + diff);
		diff = PI - E;
		System.out.println("PI plus E equals        " + diff);
		diff = c - a - b - d;
		System.out.println("c - a - b - d equals    " + diff);
		diff = -c - a - b - -d;
		System.out.println("-c - a - b - -d equals  " + diff);
		diff =  PI - E - 42.24;
		System.out.println("PI - E - 42.24 equals   " + diff);
		System.out.println();
		// Multiplication
		prod = a * 1;
		System.out.println("a times 1 equals        " + prod);
		prod = b * 2.5;
		System.out.println("b times 2.5 equals      " + prod);
		prod = c * -33.33;
		System.out.println("c times -33.33 equals   " + prod);
		prod = a * b;
		System.out.println("a times b equals        " + prod);
		prod = -a * b;
		System.out.println("-a times b equals       " + prod);
		prod = a * -b;
		System.out.println("a times -b equals       " + prod);
		prod = -a * -b;
		System.out.println("-a times -b equals      " + prod);
		prod = d * E;
		System.out.println("d times E equals        " + prod);
		prod = c * d;
		System.out.println("c times d equals        " + prod);
		prod=  PI * E;
		System.out.println("PI times E equals       " + prod);
		System.out.println();
		// Division
		quot = a / 1;
		System.out.println("a divided by 1 equals   " + quot);
		quot = b / 2;
		System.out.println("b divided by 2 equals   " + quot);
		quot = c / -7;
		System.out.println("c divided by -7 equals  " + quot);
		quot = a / b;
		System.out.println("a divided by b equals   " + quot);
		quot = -a / b;
		System.out.println("-a divided by b equals  " + quot);
		quot = a / -b;
		System.out.println("a divided by -b equals  " + quot);
		quot = -a / -b;
		System.out.println("-a divided by -b equals " + quot);
		quot = d / E;
		System.out.println("d divided by E equals   " + quot);
		quot = c / d;
		System.out.println("c divided by d equals   " + quot);
		quot=  PI / E;
		System.out.println("PI divided by E equals  " + quot);
		System.out.println();
		//Square
		pow = a * a;
		System.out.println("a squared equals        " + pow);
		pow = b * b * b;
		System.out.println("b cubed equals          " + pow);
		pow = PI * PI * PI * PI;
		System.out.println("PI to the 4th power is  " + pow);
		pow = E * E * E * E * E;
		System.out.println("E to the 5th power is   " + pow);
		
		System.out.println();
	}
}
