package main;

import java.awt.Color;
import java.awt.Graphics;

public class Util {
	static final double twoPI  = 2 * Math.PI;

	static final double halfPI = Math.PI / 2;		
		
	public static double square(double number)  	
	{  
		return number * number;  
	}

	public static double cube(double number) 	
	{ 
		return number * number * number; 
	}
				
	public static void skip(int n)
	{
		for (int k = 1; k <= n; k++)
			System.out.println();
	}
	public static void center(String str)
	{
		int len = str.length();
		int tab = (80 - len) / 2;
		for (int k = 1; k <= tab; k++)
		   	System.out.print(" ");
		System.out.println(str);	  
	} 

	public static void rightJustify(String str)
	{
		int len = str.length();
		int tab = 80 - len;
		for (int k = 1; k <= tab; k++)
		   	System.out.print(" ");
		System.out.println(str);		  
	} 

	public static String spaces(int n)
	{
		String temp = "";
		for (int k = 1; k <= n; k++)
		   	temp += " ";
		return temp;
	}	
	public static void heading(String name, String lab, String date, String points)
	{
		int nameTab   = 28 - name.length();
		int labTab    = 28 - lab.length();
		int dateTab   = 28 - date.length();
		int pointsTab = 28 - points.length();
		skip(3);
		System.out.println("****************************************************");
		System.out.println("****************************************************");
		System.out.println("**                                                   		     			**");
		System.out.println("**  Student Name:     " + name + spaces(nameTab) + "**");
		System.out.println("**                                                			     			**");
		System.out.println("**  Lab Assignment:   " + lab + spaces(labTab) + "**");
		System.out.println("**                                                			     			**");
		System.out.println("**  Date Due:         " + date + spaces(dateTab) + "**");
		System.out.println("**                                                			     			**");
		System.out.println("**  Point Version:    " + points + spaces(pointsTab) + "**");
		System.out.println("**                                                			     			**");
		System.out.println("****************************************************");
		System.out.println("****************************************************");
		skip(3);
	}
	public static void pause()
	{
		skip(2);
		System.out.print("Press the <enter> key to continue...");
		//String dummy = Expo.enterString();
		skip(3);		
	}
	
	public static void setRandomColor(Graphics g)
	{
		//int red   = Expo.random(0,255);
	//	int green = Expo.random(0,255);
	//	int blue  = Expo.random(0,255); 
	//	Expo.setColor(g, red, green, blue);		
	}	
	
	public static void setBackground(Graphics g, Color bgColor)
	{	
	//	Expo.setColor(g,bgColor);
		//Expo.fillRectangle(g,0,0,4800,3600);		
	}
}
