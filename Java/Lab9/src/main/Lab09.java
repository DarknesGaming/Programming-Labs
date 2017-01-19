package main;

import java.applet.Applet;
import java.awt.*;

public class Lab09 extends Applet {
	
	/**
	 * Lab 09: The Tree Program, and return of the Applet.
	 * 
	 * @author DarknesGaming
	 */
	private static final long serialVersionUID = 890672301771904887L;
	
	public void paint(Graphics g) {
		setSize(800,600);
		/**
		 * This setBackground(g, Color bgColor) method sets the background color for the applet.
		 */
		Expo.setBackground(g, Expo.gray);
		Tree tree = new Tree();
		tree.drawTrunk(g);
		PineTree tree2 = new PineTree();
		tree2.drawLeaves(g);
		Expo.delay(50);
		DecoratedTree tree3 = new DecoratedTree(g);
	}
}

/**
 * Lab 9 introduces the concept of a superclass and a subclass. A superclass is basically what
 * contains everything for the subclasses that will extend from it. In this lab, "Tree" is a
 * superclass, and "PineTree" is a subclass. The PineTree class will inherit stuff from its
 * superclass.
 */
class Tree {
	/**
	 * Here, we continue to see integers listed as "Private". As explained in the Bank class
	 * in Lab 08B, anything that is declared as "private" can only be read and modified by the
	 * same class the methods that use them are in. The subclasses cannot read or modify any
	 * of these private integers.
	 */
	private int baseCenterX;
	private int baseCenterY;
	private int trunkWidth;
	private int trunkHeight;
	
	/**
	 * This is our constructor. Without this, making the tree object in the paint(g) method
	 * would've been impossible.
	 */
	public Tree() {
		baseCenterX = 375;
		baseCenterY = 600;
		trunkWidth = 50;
		trunkHeight = 200;
	}
	public void drawTrunk(Graphics g) {
		Expo.setColor(g, 128, 64, 0);
		int tlX = baseCenterX - (trunkWidth / 2);
		int tlY = baseCenterY - trunkHeight;
		int brX = baseCenterX + (trunkWidth / 2);
		int brY = baseCenterY;
		Expo.fillRectangle(g, tlX, tlY, brX, brY);
	}
	public void drawLeaves(Graphics g) {
		Expo.setColor(g, Expo.green);
		int radius = 100;
		int centerX = baseCenterX;
		int centerY = baseCenterY - (trunkHeight + radius - 5);
		Expo.fillCircle(g, centerX, centerY, radius);
	}
}

class PineTree extends Tree {
	/**
	 * These integers are listed as "protected." Anything that has been declared "protected"
	 * means other classes can read and modify this, but they must be subclasses. If not, then
	 * these cannot be read or modified.
	 */
	protected int leavesWidth;
	protected int leavesHeight;
	
	public PineTree() {
		leavesWidth = 300;
		leavesHeight = 300;
	}
	public void drawLeaves(Graphics g) {
		Expo.setColor(g, Expo.darkGreen);
		Expo.fillTriangle(g, 375, 50, 175, 400, 575, 400);
	}
}

class DecoratedTree extends PineTree {
	protected int ornamentsRadius;
	
	public DecoratedTree(Graphics g) {
		int starRadius = 50;
		Expo.setColor(g, Expo.yellow);
		Expo.fillStar(g, 375, 50, starRadius, 5);
		ornamentsRadius = 25;
		
		// The flashing ornaments.
		/**
		 * In this loop, each ornament will have different colors that will flash, but will stop
		 * once integer "i" in the "for" loop reaches 500.
		 */
		for (int i = 0; i < 500; i++)
		{
			Expo.setRandomColor(g);
			Expo.fillCircle(g, 180, 400, ornamentsRadius);
			Expo.setRandomColor(g);
			Expo.fillCircle(g, 250, 400, ornamentsRadius);
			Expo.setRandomColor(g);
			Expo.fillCircle(g, 320, 400, ornamentsRadius);
			Expo.setRandomColor(g);
			Expo.fillCircle(g, 570, 400, ornamentsRadius);
			Expo.setRandomColor(g);
			Expo.fillCircle(g, 500, 400, ornamentsRadius);
			Expo.setRandomColor(g);
			Expo.fillCircle(g, 430, 400, ornamentsRadius);
			Expo.setRandomColor(g);
			Expo.fillCircle(g, 230, 320, ornamentsRadius);
			Expo.setRandomColor(g);
			Expo.fillCircle(g, 300, 320, ornamentsRadius);
			Expo.setRandomColor(g);
			Expo.fillCircle(g, 370, 320, ornamentsRadius);
			Expo.setRandomColor(g);
			Expo.fillCircle(g, 440, 320, ornamentsRadius);
			Expo.delay(10);
			
			
		}
		
		
	}
}
