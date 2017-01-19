package main;

import java.text.DecimalFormat;

public class Lab08 {
	/**
	 * Lab 08: The bank program.
	 * 
	 * @author DarknesGaming
	 */
	public static void main(String[] args) {
		Util.heading("Albert Tang", "Lab 08A", "November 15, 2016", "100");
		System.out.println("Bank Accounts with Interest showing Exponential Growth");
		System.out.println("=================================================================");
		System.out.println();
		DecimalFormat money = new DecimalFormat("0.00");
		/**
		 * The "new" function constructs a new object using the method specified. In this case,
		 * a new Exponential object method has been constructed under the name of bank1.
		 */
		Exponential bank1 = new Exponential(1000,5,12);
		System.out.println("$1000 deposit at 5% annual interest for 12 years equals:     $" + money.format(bank1.growth()));
		System.out.println();
		Exponential bank2 = new Exponential(5000,2,8);
		System.out.println("$5000 deposit at 2% annual interest for 8 years equals:      $" + money.format(bank2.growth()));
		System.out.println();
		Exponential bank3 = new Exponential(250000,7,30);
		System.out.println("$250,000 deposit at 7% annual interest for 30 years equals:  $" + money.format(bank3.growth()));
		System.out.println();
		Exponential bank4 = new Exponential(400,6,5);
		System.out.println("$400 deposit at 6% annual interest for 5 years equals:       $" + money.format(bank4.growth()));
		System.out.println();
		Exponential bank5 = new Exponential(1000,1,12);
		System.out.println("$1000 deposit at 1% monthly interest for 1 year equals:      $" + money.format(bank5.growth()));
		System.out.println();
		Exponential bank6 = new Exponential(2000,2,24);
		System.out.println("$2000 deposit at 2% monthly interest for 2 years equals:     $" + money.format(bank6.growth()));
		System.out.println();
		Exponential bank7 = new Exponential(3000,3,36);
		System.out.println("$3000 deposit at 3& monthly interest for 3 years equals:     $" + money.format(bank7.growth()));
		System.out.println();
		Exponential bank8 = new Exponential(100,4,52);
		System.out.println("$100 deposit at 4% weekly interest for 1 year equals:        $" + money.format(bank8.growth()));
		System.out.println();
		Exponential bank9 = new Exponential(25,5,7);
		System.out.println("$25 deposit at 5% daily interest for 1 week equals:          $" + money.format(bank9.growth()));
		System.out.println();
		Exponential bank10 = new Exponential(0.01,100,28);
		System.out.println("$0.01 deposit doubling every day for 28 days equals:         $" + bank10.growth());
		System.out.println();
		
		System.out.println();
		System.out.println();
		
		System.out.println("Car Values with Depreciation showing Exponential Decay");
		System.out.println("=================================================================");
		System.out.println();
		Exponential car1 = new Exponential(24000,-10,8);
		System.out.println("$24000 car with 10% annual depreciation for 8 years equals:  $" + money.format(car1.growth()));
		System.out.println();
		Exponential car2 = new Exponential(9000,-9,9);
		System.out.println("$9000 car with 9% annual depreciation for 9 years equals:    $" + money.format(car2.growth()));
		System.out.println();
		Exponential car3 = new Exponential(6000,-7.5,5);
		System.out.println("$6000 car with 7.5% annual depreciation for 5 years equals:  $" + money.format(car3.growth()));
		System.out.println();
		Exponential car4 = new Exponential(12500,-5,17);
		System.out.println("$12500 car with 5% annual depreciation for 17 years equals:  $" + money.format(car4.growth()));
		System.out.println();
		Exponential car5 = new Exponential(50000,-3,48);
		System.out.println("$50000 car with 3% monthly depreciation for 4 years equals:  $" + money.format(car5.growth()));
		
		
		// The other 4 car objects go here.
		System.out.println();
		System.out.println();
		
	}
}

class Exponential {
	double C;     // Starting Value
	double r;     // Rate of growth or decay
	double t;     // Time in days, weeks, months, or years
	
	public Exponential(double CTemp, double rTemp, double tTemp) {
		C = CTemp;
		r = rTemp / 100;   // Converts % rate to actual rate
		t = tTemp;
	}
	
	public double growth() {
		double result = C;
		for (int j = 1; j <=t; j++)
			result *= (1 + r);
		return result;
	}
}