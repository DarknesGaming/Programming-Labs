package main;

import java.applet.Applet;
import java.awt.Graphics;

public class Lab05D extends Applet {
	/**
	 * Lab 05D: Drawing a flag.
	 * 
	 * @author DarknesGaming
	 */
	private static final long serialVersionUID = 1L;
	public void paint(Graphics g) {
		setSize(1200,800); // Set default size of the Applet
		
		// The United Kingdom Flag
		Expo.setColor(g, Expo.red);
		Expo.drawThickLine(g, 600, 0, 600, 800, 60);
		Expo.drawThickLine(g, 0, 400, 1200, 400, 60);
		// Diagonal Red Lines
		// Expo.drawThickLine();
		// Blue Triangles
		Expo.setColor(g, Expo.blue);
		// Inner Triangles
		Expo.fillTriangle(g, 525, 0, 525, 325, 100, 0);
		Expo.fillTriangle(g, 675, 0, 675, 325, 1100, 0);
		Expo.fillTriangle(g, 525, 475, 525, 800, 100, 800);
		Expo.fillTriangle(g, 675, 475, 675, 800, 1100, 800);
		// Outer Triangles
		Expo.fillTriangle(g, 0, 0, 0, 325, 400, 325);
		Expo.fillTriangle(g, 1200, 0, 1200, 325, 800, 325);
		Expo.fillTriangle(g, 1200, 800, 1200, 475, 800, 475);
		Expo.fillTriangle(g, 0, 800, 0, 475, 400, 475);
	}
	
	
}
