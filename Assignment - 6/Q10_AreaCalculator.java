import java.util.*;
public class Q10_AreaCalculator {
	//square area
	public static int area(int s)
	{
		return 4*s;
	}
	//rectangle area
	public static int area(int l,int b)
	{
		return l*b;
	}
	//circle area
	public static double area(double r)
	{
		return Math.PI*r*r;
	}
	//triangle area
	public static double area(double b,double h)
	{
		return 0.5 * b * h;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("=== AREA CALCULATOR (Method Overloading) === \r\n"
				+ "1. Area of Square \r\n"
				+ "2. Area of Rectangle \r\n"
				+ "3. Area of Circle \r\n"
				+ "4. Area of Triangle \r\n"
				+ "5. Exit \r\n"
				+ "Enter your choice:");
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter length of side: ");
			int s = sc.nextInt();
			System.out.println("Area of square: "+area(s));
			break;
		case 2:
			System.out.println("Enter length Aand breadth: ");
			int l = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Area of rectangle: "+area(l,b));
			break;
		case 3:
			System.out.println("Enter radius of circle: ");
			double r = sc.nextDouble();
			System.out.println("Area of circle: "+area(r));
			break;
		case 4:
			System.out.println("Enter base and height: ");
			double base = sc.nextDouble();
			double h = sc.nextDouble();
			System.out.println("Area of triangle: "+area(base,h));
			break;
		case 5:
			System.out.println("Thank you!!!");
			break;
		default:
			System.out.println("Wrong choice entered");
		}
	}
}
