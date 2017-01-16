package main;

import java.applet.Applet;
import java.awt.Graphics;

/**
 * Lab 06B: Drawing a house using the Expo class method.
 * This is all done inside an applet, and uses the Graphics class file from
 * the AWT package to draw the graphics so you can see them.
 * @author atang4621
 */
public class Lab06B extends Applet {

	private static final long serialVersionUID = 8144623814156927363L;
	public void paint(Graphics g) {
		setSize(800,600); // Set the size of the applet
		
		House.drawBase(g);
		// The Roof
		House.drawRoof(g);
		// The Chimney
		House.drawChimney(g);
		// The Door
		House.drawDoor(g);
		// The Windows
		House.drawWindows(g);
		// The Smoke
		House.drawSmoke(g);
		// The Sun
		House.drawSun(g);
	}
	public static class House {
		// This is the House class file, which contains methods that build the house.
	public static void drawBase(Graphics g) {
		Expo.setColor(g, Expo.blue);
		Expo.drawRectangle(g, 200, 200, 500, 300);
		Expo.drawRectangle(g, 200, 300, 500, 400);
	}
	public static void drawRoof(Graphics g) {
		Expo.setColor(g, Expo.red);
		Expo.drawLine(g, 200, 200, 350, 100);
		Expo.drawLine(g, 500, 200, 350, 100);
		Expo.drawLine(g, 200, 200, 500, 200);
	}
	public static void drawChimney(Graphics g) {
		Expo.setColor(g, Expo.red);
		Expo.drawLine(g, 420, 146, 420, 80);
		Expo.drawLine(g, 420, 80, 450, 80);
		Expo.drawLine(g, 450, 80, 450, 166);
	}
	public static void drawDoor(Graphics g) {
		Expo.setColor(g, Expo.black);
		Expo.drawRectangle(g, 330, 340, 370, 400);
		Expo.drawOval(g, 350, 370, 10, 20);
		Expo.fillCircle(g, 366, 370, 3);
	}
	public static void drawWindows(Graphics g) {
		Expo.setColor(g, Expo.black);
		Expo.drawRectangle(g, 220, 220, 280, 280);
		Expo.drawLine(g, 220, 250, 280, 250);
		Expo.drawLine(g, 250, 220, 250, 280);
		Expo.drawRectangle(g, 420, 220, 480, 280);
		Expo.drawLine(g, 420, 250, 480, 250);
		Expo.drawLine(g, 450, 220, 450, 280);
		Expo.drawRectangle(g, 320, 220, 380, 280);
		Expo.drawLine(g, 320, 250, 380, 250);
		Expo.drawLine(g, 350, 220, 350, 280);
		Expo.drawRectangle(g, 220, 320, 280, 380);
		Expo.drawLine(g, 220, 350, 280, 350);
		Expo.drawLine(g, 250, 320, 250, 380);
		Expo.drawRectangle(g, 420, 320, 480, 380);
		Expo.drawLine(g, 420, 350, 480, 350);
		Expo.drawLine(g, 450, 320, 450, 380);
	}
	public static void drawSmoke(Graphics g) {
		Expo.setColor(g, Expo.gray);
		int x = 450; int y = 60; int radius = 25;
		for (int j = 1; j <= 15; j++)
		{
			Expo.drawSpiral(g, x, y, radius);
			x += 10;
			y--;
		}
	}
	public static void drawSun(Graphics g) {
		Expo.setColor(g, Expo.yellow);
		Expo.fillCircle(g, 100, 100, 50);
		Expo.drawThickLine(g, 100, 100, 100, 0, 10);
		Expo.drawThickLine(g, 100, 100, 100, 200, 10);
		Expo.drawThickLine(g, 100, 100, 200, 100, 10);
		Expo.drawThickLine(g, 100, 100, 0, 100, 10);
	}
	}

}
