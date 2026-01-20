import java.util.*;
public class Q4_PolygonArea {
	public static double area(int n, double side)
	{
		return (n*Math.pow(side, 2))/(4*Math.tan(Math.PI/n));
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of sides: ");
		int n = sc.nextInt();
		System.out.println("Enter length of each side: ");
		int l = sc.nextInt();
		System.out.println("Area of polygon = "+area(n,l));
	}
}
