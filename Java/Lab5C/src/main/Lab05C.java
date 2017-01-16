package main;

import java.awt.*;
import java.applet.*;

public class Lab05C extends Applet {
	/**
	 * Lab 05C: "For" loops, thick lines, circles, and a grid.
	 * 
	 * @author DarknesGaming
	 */
	private static final long serialVersionUID = -2696213175440973160L;

	public void paint(Graphics g) {
		setSize(900, 600); // Set the size of the Applet.
		/**
		 * This is the code for the grid, which creates 6 cells.
		 */
		Expo.drawLine(g, 300, 0, 300, 600);
		Expo.drawLine(g, 600, 0, 600, 600);
		Expo.drawLine(g, 0, 300, 900, 300);
		
		// Draw Red Horizontal Lines
		Expo.setColor(g, Expo.red);
		/**
		 * In this loop, the applet will keep drawing lines until y is no longer less
		 * than 300. Every time a line is drawn, y is increased by 10.
		 */
		for (int y = 10; y < 300; y += 10)
		{
			Expo.drawThickLine(g, 0, y, 299, y, 3);
		}
		
		// Draw Blue Vertical Lines
		Expo.setColor(g, Expo.blue);
		
		for (int x = 310; x < 600; x += 10)
		{
			Expo.drawThickLine(g, x, 0, x, 300, 3);
		}
		
		// Draw Green Concentric Circles
		Expo.setColor(g, Expo.green);
		
		for (int r = 10; r < 150; r += 10)
		{
			Expo.drawThickCircle(g, 750, 150, r, 3);
		}
		
		// Draw Purple Concentric 7-point stars
		Expo.setColor(g, Expo.purple);
		
		for (int c = 10; c < 150; c += 20)
		{
			Expo.drawThickStar(g, 150, 450, c, 7, 3);
		}
		
		// Draw Brown Concentric Squares
		Expo.setColor(g, Expo.brown);
		
		for (int b = 10; b < 200; b += 15)
		{
			Expo.drawThickRegularPolygon(g, 450, 450, b, 4, 3);
		}
		
		// Draw Gold Sphere
		Expo.setColor(g, Expo.gold);
		
		for (int o = 0; o < 149; o += 10)
		{
			Expo.drawOval(g, 750, 450, 150, o);
			Expo.drawOval(g, 750, 450, o, 150);
		}
	}
}
