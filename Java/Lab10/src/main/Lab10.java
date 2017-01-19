package main;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Lab10 extends Applet {

	/** 
	 * Lab 10: Applets, trains, and graphics.
	 * 
	 * @author DarknesGaming
	 */
	private static final long serialVersionUID = 1718144677874446031L;
	
	public void paint(Graphics g) {
		setSize(1366,768);
	    Train train = new Train(g, getX());
	    //Expo.delay(100);
	    //Train.eraseTrain(g,getX());
	}
}

class TrainCar {
	
	private Color carColor;
	
	public TrainCar(Graphics g, Color cc, int x) {
		carColor = cc;
		
		g.setColor(carColor);
		g.fillRect(x, 250, 150, 100);
		g.setColor(Color.black);
		g.fillOval(x+5, 325, 50, 50);
		g.fillOval(x+95, 325, 50, 50);
	}
}

class Tracks {
	public Tracks(Graphics g) {
		g.setColor(Color.DARK_GRAY);
		g.fillRect(0, 375, 1366, 10);
	}
}

class Locomotive extends TrainCar {
	private int x;
	private int tlX;
	private int tlY;
	public Locomotive(Graphics g, Color cc, int x1) {
		/**
		 * The super() method calls the parent constructor without any arguments. In this case,
		 * the super() method in this class is calling the parent constructor in the superclass
		 * TrainCar. You can also use super as a keyword to override existing methods.
		 */
		
		super(g, cc, x1);
		x = x1;
		tlX = x;
		drawScoop(g);
		drawFunnel(g);
		Expo.delay(50);
		drawSmoke(g);
	}
	
	public void drawScoop(Graphics g) {
		/**
		 * This is what you see on the front of the train. Trains usually have this to move debris
		 * from the tracks so they can keep moving without derailing.
		 */
		Polygon scoop = new Polygon();
		scoop.addPoint(x, 300);
		scoop.addPoint(x, 350);
		scoop.addPoint(x-50, 350);
		g.setColor(Color.BLACK);
		g.fillPolygon(scoop);
	}
	
	public void drawFunnel(Graphics g) {
		/**
		 * You usually see this on trains. This is where the smoke comes out of the train.
		 */
		Polygon funnel = new Polygon();
		funnel.addPoint(x+20, 250);
		funnel.addPoint(x+20, 220);
		funnel.addPoint(x, 200);
		funnel.addPoint(x, 190);
		funnel.addPoint(x+60, 190);
		funnel.addPoint(x+60, 200);
		funnel.addPoint(x+40, 220);
		funnel.addPoint(x+40, 250);
		g.setColor(Color.BLACK);
		g.fillPolygon(funnel);
	}
	public void moveLocomotive(Graphics g, int x, int y) {
		/**
		 * The animation method.
		 */
		drawScoop(g);
		drawFunnel(g);
	}
	public void eraseLocomotive(Graphics g, int x, int y) {
		g.setColor(Color.WHITE);
		g.fillOval(x+5, 325, 50, 50);
		g.fillOval(x+95, 325, 50, 50);
	}
	public void drawSmoke(Graphics g) {
		//for (int f = 0; f <= 1000; f++) {
			//Expo.setRandomColor(g);
			Expo.drawThickSpiral(g, 100, 120, 50, 5);	
		//}
			
	}
	
}
class Caboose extends TrainCar {

	public Caboose(Graphics g, Color cc, int x) {
		super(g, cc, x);
		g.setColor(Color.WHITE);
		g.fillRect(x+10, 270, 50, 40);
		g.fillRect(x+90, 270, 50, 40);
		g.setColor(Color.RED);
		g.fillRect(x+50, 220, 50, 50);
	}
	
}
class Train {
	private Locomotive loc;
	private TrainCar tc1;
	private TrainCar tc2;
	private TrainCar tc3;
	private TrainCar tc4;
	private Caboose cab;
	
	/**
	 * This method is called to actually make the train, and animate it. However, the animation
	 * method was removed since it gives undesirable results.
	 * @param g
	 * @param x
	 */
	public Train(Graphics g, int x) {
		Tracks tc6 = new Tracks(g);
		//for (x = 70; x <= 1920; x += 10) {
		loc = new Locomotive(g,Color.BLUE, x);
		tc1 = new TrainCar(g, Color.blue, x+170);
		tc2 = new TrainCar(g, Color.green, x+340);
		tc3 = new TrainCar(g, Color.YELLOW, x+510);
	    tc4 = new TrainCar(g, Color.magenta, x+680);
		cab = new Caboose(g, Color.RED, x+850);
		//eraseTrain(g,x);
		//}
		
	    
		
		
	}
	public void moveTrain(Graphics g, int x) {
		
	}
	public static void eraseTrain(Graphics g, int x) {
		for (x = 70; x <= 1920; x += 10) {
		Locomotive loc = new Locomotive(g,Color.WHITE, x);
		TrainCar tc1 = new TrainCar(g, Color.WHITE, x+170);
		TrainCar tc2 = new TrainCar(g, Color.WHITE, x+340);
		TrainCar tc3 = new TrainCar(g, Color.WHITE, x+510);
	    TrainCar tc4 = new TrainCar(g, Color.WHITE, x+680);
		TrainCar cab = new Caboose(g, Color.WHITE, x+850);	
		}
		
	}
}