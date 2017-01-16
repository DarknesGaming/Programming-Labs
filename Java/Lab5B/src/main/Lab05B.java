package main;

public class Lab05B {
	/**
	 * Lab 05B: Conditional Statements, and a lot of speeding.
	 * 
	 * @author DarknesGaming
	 */
	public static void main(String args[]) {
		/**
		 * This is a lab that I built from scratch. My assignment was to build code that
		 * would calculate how much you would have to pay for speeding a certain amount
		 * of miles. Conditional statements are used for certain conditions.
		 */
		System.out.print("Input a number. --->");
		int i = Expo.enterInt();
		System.out.println("You are speeding by a total of " + i + " miles per hour!");
		System.out.println("You got a $75 ticket for speeding!");
		if ( i > 30 )
			/**
			 * If the number you typed in is more than 30, an extra $160 will be charged.
			 */
		{
			System.out.println("You have been charged " + e(i) + " dollars for speeding " + i + " miles per hour!");
			System.out.println("You have also been charged 160 dollars for going over 30 mph!");
		} else {
			System.out.println("You have been charged " + e(i) + " dollars for speeding " + i + " miles per hour!");
		}
		System.out.println("Did you speed in a school zone?");
		System.out.print("Press One if you were. Press any other number if you did not. --->");
		int j = Expo.enterInt();
		if (j == 1) {
			/**
			 * If you put in the number 1, your fine gets doubled.
			 */
			System.out.println("Your fine has been doubled!");
		}
		else
			System.out.println("Good. You didn't speed in a school zone.");
		if (i > 30)
		{
			if (j == 1) { // Speeding over 30 mph in a school zone.
				int k = (e(i) + 160 + 75) * 2;
				System.out.println("Your total fine is " + k + " dollars!");
				
			}
			else { // Speeding over 30 mph, but not in a school zone.
				int k = e(i) + 160 + 75; 
				System.out.println("Your total fine is " + k + " dollars!");
			}
		} else if (i < 30 ) { // Speeding less than 30 mph in a school zone.
			if (j == 1) {
				int k = (e(i) + 75) * 2; 
				System.out.println("Your total fine is " + k + " dollars!");	
			}
			else // Speeding less than 30 mph, but not in a school zone.
			{
				int k = e(i) + 75;
				System.out.println("Your total fine is " + k + " dollars!");
			}
		}
	}
	public static int e(int i) {
		return i * 6;
	}
}
