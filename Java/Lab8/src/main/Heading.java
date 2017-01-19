package main;

public class Heading {

	public static void main(String[] args) {
		Util.heading("Albert Tang","Lab 7B","November 8, 2016", "100");
		//Util.pause();
		System.out.println("Left-Justified Output is default.");
		Util.skip(3);
		Util.center("This output is centered.");
		Util.skip(4);
		Util.rightJustify("This output is right justified.");
		Util.skip(2);
		System.out.println("10 squared: 	" + Util.square(10));
		Util.skip(1);
		System.out.println("10 cubed: 		" + Util.cube(10));
		Util.skip(1);
		System.out.println("2 * PI:    		" + Util.twoPI);
		Util.skip(1);
		System.out.println("PI / 2:    		" + Util.halfPI);
		Util.skip(2);
	
		
		
	}

}
