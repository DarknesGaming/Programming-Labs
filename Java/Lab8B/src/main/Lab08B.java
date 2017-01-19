package main;

public class Lab08B {
	/**
	 * Lab 8B: Objects, object methods, constructors, and more objects.
	 * 
	 * @author DarknesGaming
	 */

	public static void main(String[] args) {
		Util.heading("Albert Tang", "Lab 08B", "November 15, 2016", "100");
		// Instantiate 3 bank objects
		/**
		 * As explained in Lab 8 (or 8A), the "new" method constructs a new object, which will
		 * only have object methods within them. The Bank class file if not defined here, but
		 * within a new file I created.
		 */
		Bank tom = new Bank();
		Bank sue = new Bank(3000.0);
		Bank bob = new Bank(5000.0,10000.0);
		
		// Call object methods
		tom.showBalances("Tom Smith");
		sue.showBalances("Sue Brown");
		bob.showBalances("Bob Jones");
		
		System.out.println("Tom Deposits $1000 in checking and $5000 in savings.");
		tom.makeCheckingDeposit(1000);
		tom.makeSavingsDeposit(5000);
		tom.showBalances("Tom Smith");
		
		System.out.println("Bob withdraws $4000 from checking.");
		bob.makeCheckingWithdrawal(4000);
		bob.showBalances("Bob Jones");
		
		System.out.println("Tom withdraws $4000 from checking.");
		tom.makeCheckingWithdrawal(4000);
		tom.showBalances("Tom Smith");
		
		System.out.println("Sue withdraws $4000 from checking.");
		sue.makeCheckingWithdrawal(4000);
		sue.showBalances("Sue Brown");
		
		System.out.println("Bob transfers $5000 from savings to checking.");
		bob.transferToChecking(5000);
		bob.showBalances("Bob Jones");
		
		System.out.println("Sue transfers $2000 from checking to savings.");
		sue.transferToSavings(2000);
		sue.showBalances("Sue Brown");
		
		System.out.println("Tom deposits 75% of a $10,000 paycheck in checking");
		System.out.println("and puts the rest in savings.");
		tom.makeSplitDeposit(10000,75);
		tom.showBalances("Tom Smith");
		
		tom.showBalances("Tom Smith");
		sue.showBalances("Sue Brown");
		bob.showBalances("Bob Jones");
	}

}
