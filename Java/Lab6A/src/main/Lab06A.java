package main;

import java.applet.Applet;
import java.awt.Graphics;

public class Lab06A extends Applet {
	/**
	 * Lab 06A: Drawing random stuff using random numbers in a grid.
	 * 
	 * @author DarknesGaming
	 */
	private static final long serialVersionUID = 2543415478917769128L;

	public void paint(Graphics g) {
		setSize(900,600); // Set the default size of the Applet
		
		// Draw the Grid
		Expo.drawLine(g, 300, 0, 300, 600);
		Expo.drawLine(g, 600, 0, 600, 600);
		Expo.drawLine(g, 0, 300, 900, 300);
		
		// Draw Random Points
		for (int count = 1; count <= 10000; count++)
		{
			Expo.setRandomColor(g);
			int x = Expo.random(5, 295);
			int y = Expo.random(5, 295);
			Expo.drawPoint(g, x, y);
		}
		
		// Draw Random Lines
		for (int count = 1; count <= 1000; count++)
		{
			Expo.setRandomColor(g);
			int x = Expo.random(305, 595);
			int y = Expo.random(5, 295);
			int x1 = Expo.random(305, 595);
			int y1 = Expo.random(5, 295);
			Expo.drawThickLine(g, x, y, x1, y1, 1);
		}
		
		// Draw Random Rectangles
		for (int count = 1; count <= 1000; count++)
		{
			Expo.setRandomColor(g);
			int x = Expo.random(605, 899);
			int y = Expo.random(5, 295);
			int x1 = Expo.random(605, 899);
			int y1 = Expo.random(5, 295);
			Expo.fillRectangle(g, x, y, x1, y1);
		}
		
		// Draw Random Stars with random points
		for (int count = 1; count <= 1000; count++)
		{
			Expo.setRandomColor(g);
			int x = Expo.random(30, 270);
			int y = Expo.random(330, 570);
			int points = Expo.random(5, 10);
			Expo.fillStar(g, x, y, 30, points);
		}
		
		// Draw Random Circles with random radius
		for (int count = 1; count <= 1000; count++)
		{
			Expo.setRandomColor(g);
			int x = Expo.random(375, 525);
			int y = Expo.random(375, 525);
			int r = Expo.random(0, 75);
			Expo.fillCircle(g, x, y, r);
		}
		
		// Draw Random Bursts
		for (int count = 1; count <= 1000; count++)
		{
			Expo.setRandomColor(g);
			int x = Expo.random(650, 850);
			int y = Expo.random(350, 550);
			int radius = Expo.random(0, 50);
			int numLines = Expo.random(1, 10);
			Expo.drawThickBurst(g, x, y, radius, numLines, 2);
		}
	}

}
