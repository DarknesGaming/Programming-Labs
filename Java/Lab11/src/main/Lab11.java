package main;

import java.applet.Applet;
import java.awt.*;
import java.util.*;

public class Lab11 extends Applet {

	private static final long serialVersionUID = 1L;

	/**
	 * Lab 11: Booleans, graphics, random colors, and switch cases.
	 * 
	 * @author DarknesGaming
	 */
	
	public void paint(Graphics g) {
		setSize(800,600);
		int circleCount = 160;
		
		Circles circles = new Circles(g,circleCount);
	}
	
}

class Circles {
	
	/**
	 * Here, we declare the new private variables, but we don't give them a value until we call
	 * the methods. The methods will give these variables something.
	 */
	private int circleCount;
	private Random rnd;
	private Color randomColor;
	private int colorRow;
	
	private int redCount, greenCount, blueCount, grayCount;
	
	
	// Circle object constructor
	public Circles(Graphics g, int c) {
		rnd = new Random(12345);
		circleCount = c;
		/**
		 * These next three variables are what we will be using as booleans. Booleans are basically
		 * like answering "Yes or No" questions, but to the computer, Yes is "1" and No is "0".
		 * That's all a computer can understand: A series of 1s and 0s. This is what we know as
		 * binary code. Computers need this to run, and they are usually in a set of instructions
		 * translated to binary, and because they need it, they are actually a lot less intelligent
		 * than humans.
		 */
		redCount = 1;
		greenCount = 1;
		blueCount = 1;
		grayCount = 1;
		drawSquares(g);
		for (int k = 1; k <= circleCount; k++)
			drawRandomCircle(g);
	}
	
	// Method to draw primary color squares
	public void drawSquares(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(10, 100, 30, 30);
		g.setColor(Color.GREEN);
		g.fillRect(10, 250, 30, 30);
		g.setColor(Color.BLUE);
		g.fillRect(10, 400, 30, 30);
		g.setColor(Color.GRAY);
		g.fillRect(10, 550, 30, 30);
	}
	
	// Method to draw the circle in the proper primary color square row
	public void drawRandomCircle(Graphics g) { 
		int xpos = 0;
		int ypos = 0;
		getRandomColor(randomColor);
		/**
		 * The switch keyword is used to switch between cases that we run into. In the
		 * getRandomColor() method, there are 3 color rows. If a circle were to end up in color
		 * row 1, the code in "case 1" would be executed. The "break" keyword at the end of the
		 * case tells the program to jump over the other cases and finish executing the method.
		 */
		switch(colorRow) {
		case 1:
			redCount++;
			if (redCount < 19)
				ypos = 100;
			else
				ypos = 150;
			xpos = (redCount % 18) * 40 + 50;
			break;
		case 2:
			blueCount++;
			if (blueCount < 19)
				ypos = 250;
			else
				ypos = 300;
			xpos = (blueCount % 18) * 40 + 50;
			break;
		case 3:
			greenCount++;
			if (greenCount < 19)
				ypos = 400;
			else
				ypos = 450;
			xpos = (greenCount % 18) * 40 + 50;
			break;
		case 4:
			grayCount++;
			if (grayCount < 18)
				ypos = 550;
			else
				ypos = 600;
			xpos = (grayCount % 18) * 40 + 20;
			break;
		}
		g.setColor(randomColor);
		g.fillOval(xpos, ypos, 30, 30);
	}
	
	// Method to generate a random color to be used in a circle (r,g,b) format where values are
	// 0 to 255.
	public void getRandomColor(Color c) {
		/**
		 * Here, we use the random class file that has been called through variable "rnd" to
		 * generate random numbers. Here, we want to generate numbers between 0 and 255. The only
		 * reason I put in 256 is because the numbers that are generated are subtracted by 1.
		 */
		int red = rnd.nextInt(255);
		int grn = rnd.nextInt(255);
		int blue = rnd.nextInt(255);
		randomColor = new Color(red, grn, blue);
		/**
		 * For these "if" statements, 2 conditions are met. "&&" means "and", which means if any
		 * of the conditions aren't met, move on to the next one. If all the conditions are met,
		 * run the code.
		 */
		if (red > grn && red > blue)
			colorRow = 1;
		if (grn > red && grn > blue)
			colorRow = 2;
		if (blue > red && blue > grn)
			colorRow = 3;
		if (red == blue || blue == grn || red == grn)
			colorRow = 4;
		
	}
}
