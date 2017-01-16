package main;

public class Lab05A {
	/**
	 * Lab 05A: The input lab.
	 * 
	 * @author DarknesGaming
	 */
    public static void main(String args[]) {
    	System.out.println();
    	/**
    	 * This is where we will be inputting a number of our choice. What you put in
    	 * will become integer i, and the next number you input will become integer j,
    	 * and is calculated within the return methods built at the bottom of the code.
    	 * The numbers that the code will output depends on what numbers you input.
    	 */
    	System.out.print("Enter the first number ----> ");
    	int i = Expo.enterInt();
    	System.out.print("Enter the second number ---> ");
    	int j = Expo.enterInt();
    	// Output from the methods
    	System.out.println("f(" + i + ")                       " + f(i));
    	System.out.println("g(" + i + ")                       " + g(i));
    	System.out.println("h(" + i + ")                       " + h(i));
    	System.out.println();
    	System.out.println("f(" + j + ")                       " + f2(j));
    	System.out.println("g(" + j + ")                       " + g2(j));
    	System.out.println("h(" + j + ")                       " + h2(j));
    }
    
    /**
     * These methods are return methods. Notice how there's no "void" type in these.
     * If these methods were void methods, we would get errors because void methods
     * don't return anything. These methods are double methods, and MUST return
     * something. In this case, these methods will return the answer to the output
     * methods that are above this comment.
     */
	public static double f(int i) {
        return 2*i + 3;
	}
	public static double g(int i) {
		return 10*i - 5;
	}
	public static double h(int i) {
		return Math.pow(i, 3);
	}
	public static double f2(int j) {
		return 2*j + 3;
	}
	public static double g2(int j) {
		return 10*j - 5;
	}
	public static double h2(int j) {
		return Math.pow(j, 3);
	}
}
