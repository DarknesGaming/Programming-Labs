package main;

import java.applet.Applet;
import java.awt.*;

public class Lab04B extends Applet {
	/**
	 * Lab 04B: Drawing shapes in an Applet.
	 * 
	 * @author DarknesGaming
	 */
	private static final long serialVersionUID = -1508735916769577418L;

	/**
	 * This is the paint method, which will draw Graphics. We will be using the Expo
	 * class to get this done rather quickly, and to avoid any confusion.
	 */
public void paint(Graphics g) {
	/**
	 * The setSize() method is used to define the size of a Java application, or
	 * applet if it's being run from the Eclipse IDE. In this case, the default
	 * size is set to the equivalent of a 1080p resolution (1920x1080).
	 */
	setSize(1920, 1080);
	// Cube Code goes here
	/**
	 * To draw the cube, 2 squares are drawn first. 4 lines are drawn to connect the
	 * vertices together correctly to get a cube.
	 */
	Expo.drawRectangle(g, 100, 100, 400, 400);
	Expo.drawRectangle(g, 200, 200, 500, 500);
	Expo.drawLine(g, 100, 400, 200, 500);
	Expo.drawLine(g, 100, 100, 200, 200);
	Expo.drawLine(g, 400, 100, 500, 200);
	Expo.drawLine(g, 400, 400, 500, 500);
	
	// Circle code goes here
	/**
	 * This is used to draw a target in the code. If you reverse the order of the code,
	 * you won't see a target anymore, but rather a big circle. The point of the order
	 * you see right now is so you can see all the circles.
	 * In some way, the circles are stacked on top of another, and you are getting a
	 * bird's eye view.
	 */
	Expo.setColor(g, 3);
	Expo.fillCircle(g, 1500, 300, 200);
	Expo.setColor(g, 2);
	Expo.fillCircle(g, 1500, 300, 150);
	Expo.setColor(g, 1);
	Expo.fillCircle(g, 1500, 300, 100);
	Expo.setColor(g, -1);
	Expo.fillCircle(g, 1500, 300, 50);
	
	// Triangle code goes here
	Expo.setColor(g, 1);
	Expo.drawTriangle(g, 1000, 500, 700, 950, 1300, 950);
	Expo.drawLine(g, 850, 725, 1000, 950);
	Expo.drawLine(g, 1000, 950, 1150, 725);
	Expo.drawLine(g, 1150, 725, 850, 725);
    }
}
