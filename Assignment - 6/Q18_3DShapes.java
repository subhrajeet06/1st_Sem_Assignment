import java.util.*;
public class Q18_3DShapes {
	public static double volume(int side)
	{
		return side * side * side;
	}
	public static double volume(double length, double width,double height)
	{
		return length * width * height;
	}
	public static double volume(double radius)
	{
		return (double)4/3 * Math.PI * Math.pow(radius, 3);
	}
	public static double volume(double radius, double height)
	{
		return Math.PI * radius * radius * height;
	}
	public static void main(String[] argd)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("=== VOLUME CALCULATOR (Method Overloading) === \r\n"
				+ "1. Volume of Cube \r\n"
				+ "2. Volume of Rectangular Prism (Cuboid) \r\n"
				+ "3. Volume of Sphere \r\n"
				+ "4. Volume of Cylinder \r\n"
				+ "5. Exit \r\n"
				+ "Enter your choice:");
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter length of side: ");
			int s = sc.nextInt();
			System.out.println("Area of cube: "+volume(s));
			break;
		case 2:
			System.out.println("Enter length Aand breadth and height: ");
			double l = sc.nextDouble();
			double b = sc.nextDouble();
			double h = sc.nextDouble();
			System.out.println("Area of rectangle: "+volume(l,b,h));
			break;
		case 3:
			System.out.println("Enter radius of sphere: ");
			double r = sc.nextDouble();
			System.out.println("Area of sphere: "+volume(r));
			break;
		case 4:
			System.out.println("Enter radius and height: ");
			double rad = sc.nextDouble();
			double ht = sc.nextDouble();
			System.out.println("Area of cylinder: "+volume(rad,ht));
			break;
		case 5:
			System.out.println("Thank you!!!");
			break;
		default:
			System.out.println("Wrong choice entered");
			
		}
	}
}
