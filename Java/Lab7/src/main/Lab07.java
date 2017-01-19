package main;

public class Lab07 {
	/**
	 * Lab 07A: Creating classes within classes, more input, and a bit of Geometry.
	 * 
	 * @author DarknesGaming
	 */
	public static void main(String[] args) {
		System.out.print("Enter Side     ===>> ");
		int s = Expo.enterInt();
		System.out.print("Enter Length   ===>> ");
		int l = Expo.enterInt();
		System.out.print("Enter Width    ===>> ");
		int w = Expo.enterInt();
		System.out.print("Enter Height   ===>> ");
		int h = Expo.enterInt();
		System.out.print("Enter Base1    ===>> ");
		int b1 = Expo.enterInt();
		System.out.print("Enter Base2    ===>> ");
		int b2 = Expo.enterInt();
		System.out.print("Enter Radius   ===>> ");
		int r = Expo.enterInt();
		
		// Make some blank lines
		System.out.println();
		System.out.println();
		
		// First set of output.
		System.out.println("Areas of 2D Shapes");
		System.out.println("==========================================================");
		System.out.println("Square Area:                      " + Geometry.SquareArea(s));
		System.out.println("Rectangle Area:                   " + Geometry.RectangleArea(l, w));
		System.out.println("Parallelogram Area:               " + Geometry.ParallelogramArea(b1, h));
		System.out.println("Triangle Area:                    " + Geometry.TriangleArea(b1, h));
		System.out.println("Trapezoid Area:                   " + Geometry.TrapezoidArea(b1, b2, h));
		System.out.println("Circle Area:                      " + Geometry.CircleArea(r));
		
		// Make more blank lines.
		System.out.println();
		System.out.println();
		
		// Second set of output.
		System.out.println("Perimeter of 2D Shapes");
		System.out.println("==========================================================");
		System.out.println("Square Perimeter:                 " + Geometry.SquarePerimeter(s));
		System.out.println("Rectangle Perimeter:              " + Geometry.RectanglePerimeter(l, w));
		System.out.println("Circle Perimeter (circumference): " + Geometry.CirclePerimeter(r));
		
		// Make more blank lines.
		System.out.println();
		System.out.println();
		
		// Third set of output
		System.out.println("Surface Area of 3D Shapes");
		System.out.println("==========================================================");
		System.out.println("Cube Surface Area:                 " + SurfaceArea.Cube(s));
		System.out.println("Square Prism Surface Area:         " + SurfaceArea.SquarePrism(s, h));
		System.out.println("Rectangular Prism Surface Area:    " + SurfaceArea.RectanglarPrism(l, h, w));
		System.out.println("Sphere Surface Area:               " + SurfaceArea.Sphere(r));
		
		// Make more blank lines.
		System.out.println();
		System.out.println();
		
		// Fourth set of output
		System.out.println("Volume of 3D Shapes");
		System.out.println("==========================================================");
		System.out.println("Cube Volume:                       " + Volume.Cube(s));
		System.out.println("Square Prism Volume:               " + Volume.SquarePrism(s, h));
		System.out.println("Rectangular Prism Volume:          " + Volume.RectangularPrism(l, w, h));
		System.out.println("Pyramid Volume:                    " + Volume.Pyramid(s, h));
		System.out.println("Cylinder Volume:                   " + Volume.Cylinder(r, h));
		System.out.println("Cone Volume:                       " + Volume.Cone(r, h));
		System.out.println("Sphere Volume:                     " + Volume.Sphere(r));
		
		// Make more blank lines.
		System.out.println();
		System.out.println();
		
		// Fifth set of output
		System.out.println("Quadratic Formula");
		System.out.println("==========================================================");
		System.out.print("Enter a        ===>> ");
		int a = Expo.enterInt();
		System.out.print("Enter b        ===>> ");
		int b = Expo.enterInt();
		System.out.print("Enter c        ===>> ");
		int c = Expo.enterInt();
		Algebra.Quadratic(a, b, c);
		
	}
	/**
	 * This is the Geometry class file, which has been defined within the Lab 07 class
	 * file. When the program is being compiled, this will be a separate class file,
	 * but will be named "Lab07$Geometry.class".
	 * 
	 * @author DarknesGaming
	 */
static class Geometry {
	public static double SquareArea(double s) {
		return s * s;
	}
	public static double RectangleArea(double l, double w) {
		return l * w;
	}
	public static double ParallelogramArea(double b1, double h) {
		return b1 * h;
	}
	public static double TriangleArea(double b1, double h) {
		return (b1 * h) / 2;
	}
	public static double TrapezoidArea(double b1, double b2, double h) {
		return ((b1 + b2) / 2) * h;
	}
	public static double CircleArea(double r) {
		return Math.pow(r, 2) * Math.PI;
	}
	public static double SquarePerimeter(double s) {
		return s * 4;
	}
	public static double RectanglePerimeter(double l, double w) {
		return (l * 2) + (w * 2);
	}
	public static double CirclePerimeter(double r) {
		return (r * 2) * Math.PI;
	}
}
/**
 * This is the Surface Area class file, defined within the Lab 07 class file. All the
 * surface area methods are built in here. When compiled, this will be a separate class
 * file called "Lab07$SurfaceArea.class".
 * @author DarknesGaming
 *
 */
static class SurfaceArea {
	public static double Cube(double s) {
		return Math.pow(s, 2) * 6;
	}
	public static double SquarePrism(double s, double h) {
		return 2 * Math.pow(s, 2) + 4 * s * h;
	}
	public static double RectanglarPrism(double l, double h, double w) {
		return 2 * l * w + 2 * l * h + 2 * w * h;
	}
	public static double Sphere(double r) {
		return 4 * Math.PI * Math.pow(r, 2);
	}
}
/**
 * This is the Volume class file, defined within the Lab 07 class file. All the volume
 * methods are built in here. When compiled, this will be a separate class file called
 * "Lab07$Volume.class".
 * @author DarknesGaming
 *
 */
static class Volume {
	public static double Cube(double s) {
		return Math.pow(s, 3);
	}
	public static double SquarePrism(double s, double h) {
		return Math.pow(s, 2) * h;
	}
	public static double RectangularPrism(double l, double w, double h) {
		return l * w * h;
	}
	public static double Pyramid(double s, double h) {
		return Math.pow(s, 2) * h / 3;
	}
	public static double Cylinder(double r, double h) {
		return Math.PI * Math.pow(r, 2) * h;
	}
	public static double Cone(double r, double h) {
		return Math.PI * Math.pow(r, 2) * h / 3;
	}
	public static double Sphere(double r) {
		return 4 * Math.PI * Math.pow(r, 3) / 3;
	}
}
static class Algebra {
	public static void Quadratic(double a, double b, double c) {
		double d = (-(b) + Math.sqrt(Math.pow(b, 2) + (4 * a * c)) / (2 * a));
		double e = (-(b) - Math.sqrt(Math.pow(b, 2) + (4 * a * c)) / (2 * a));
		System.out.println("Answer 1 to the formula:           " + d);
		System.out.println("Answer 2 to the formula:           " + e);
	}
}
}

