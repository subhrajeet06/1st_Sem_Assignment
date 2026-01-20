import java.util.*;
public class Q1_SimpleCalculator {

	public static int additionSimple(int x, int y)
	{
		return x+y;
	}
	public static int subtractionSimple(int x, int y) 
	{
		return x - y;
	} 
	public static int multiplicationSimple(int x, int y)
	{
		return x * y;
	}
	public static double divisionSimple(int x, int y) 
	{
		if (y != 0)
		{
			return (double)x/y;
		}
		else
			return 0.0;
	}
	public static int remainderSimple(int n, int m) 
	{
		return n % m;
	}
	public static double squareRootSimple(int n)
	{
		return Math.sqrt(n);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("----- SIMPLE CALCULATOR ----- \r\n"
				+ "1. Addition \r\n"
				+ "2. Subtraction \r\n"
				+ "3. Multiplication \r\n"
				+ "4. Division \r\n"
				+ "5. Remainder \r\n"
				+ "6. Square Root \r\n"
				+ "7. Exit \r\n"
				+ "Choose an option:");
		int ch = sc.nextInt();
		int a,b;
		switch(ch)
		{
		case 1:
			System.out.println("Enter 2 numbers");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Sum = "+additionSimple(a,b));
			break;
		case 2:
			System.out.println("Enter 2 numbers");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Difference = "+subtractionSimple(a,b));
			break;
		case 3:
			System.out.println("Enter 2 numbers");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Product = "+multiplicationSimple(a,b));
			break;
		case 4:
			System.out.println("Enter 2 numbers");
			a = sc.nextInt();
			b = sc.nextInt();
			if (b != 0)
				System.out.println("Quotient = "+divisionSimple(a,b));
			else
				System.out.println("Cannot divide by zero");
			break;
		case 5:
			System.out.println("Enter 2 numbers");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Remainder = "+remainderSimple(a,b));
			break;
		case 6:
			System.out.println("Enter a number");
			a = sc.nextInt();
			if (a >= 0)
				System.out.println("Difference = "+squareRootSimple(a));
			else
				System.out.println("Wrong input");
			break;
		case 7:
			System.out.println("Thank you!!!");
			break;
		default:
			System.out.println("Wrong choice...Try again");
		}
	}

}
