package main;
/**
 * The Bank class, used as a library for Lab 08B.
 * 
 * @author DarknesGaming
 */
public class Bank {
	/**
	 * The "private" declaration for a method means that only methods within the class file can
	 * access it. No methods from another class file will be able to access whatever the private
	 * method stores.
	 */
	private double checking;
	private double savings;
	
	//Object constructors
	/**
	 * You can have constructors with the same name, but you must have different numbers of
	 * parameters or the parameters can have different names. Duplicate constructors with the
	 * same amount of parameters with the same names will often cause errors.
	 */
	public Bank() {
		checking = 0.0; savings = 0.0;
	}
	public Bank(double c) {
		checking = c;
	}
	public Bank(double c, double s) {
		checking = c; savings = s;
	}
	
	// Object methods
	/**
	 * These are the object methods, which can only be used within objects. Attempting to use
	 * them outside of objects would often cause errors.
	 */
	public double getChecking() {
		return checking;
	}
	public double getSavings() {
		return savings;
	}
	public double getCombined() {
		return checking + savings;
	}
	/**
	 * These are deprecated methods, which have been defined as "deprecated" using the 
	 * "@Deprecated" annotation. These kinds of methods are likely to go away after a certain
	 * release in the future. The best way to respond to these methods is to use methods that do
	 * the same or similar function to the deprecated method, but that method must NOT be listed
	 * as "deprecated" as well. If you don't, after a certain release, the code will fail to run
	 * and result in errors.
	 */
	@Deprecated
	public void changeSavings(double amount) {
		savings += amount;
	}
	@Deprecated
	public void changeChecking(double amount) {
		checking += amount;
	}
	public void makeCheckingDeposit(double amount) {
		checking += amount;
	}
	public void makeSavingsDeposit(double amount) {
		savings += amount;
	}
	/**
	 * If the amount of money the user wants to withdraw is greater than the amount of money in
	 * their account, no action will occur. Otherwise, continue withdrawing money from the
	 * accounts.
	 */
	public void makeCheckingWithdrawal(double amount) {
		if (amount > checking)
		checking = checking;
		else
			checking -= amount;
	}
	public void makeSavingsWithdrawal(double amount) {
		if (amount > savings)
			savings = savings;
		else
			savings -= amount;
	}
	public void transferToChecking(double amount) {
		if (amount > savings)
			savings = savings;
		else {
		checking += amount;
		savings -= amount;	
		}
	}
	public void transferToSavings(double amount) {
		if (amount > checking)
			checking = checking;
		else {
		savings += amount;
		checking -= amount;	
		}
		
	}
	public void makeSplitDeposit(double amount, double percentage) {
		// Checking
		double rate = percentage / 100;
		double result = amount * rate;
		checking += result;
		// Savings
		double percentage2 = 100 - percentage;
		double rate2 = percentage2 / 100;
		double result2 = amount * rate2;
		savings += result2;
	}
	public void closeChecking() {
		checking = 0;
	}
	public void closeSavings() {
		savings = 0;
	}
	public void showBalances(String name) {
		System.out.println();
		System.out.println("Account balances for " + name);
		System.out.println("Checking: $" + getChecking());
		System.out.println("Savings:  $" + getSavings());
		System.out.println("Combined: $" + getCombined());
		System.out.println();
	}
}
