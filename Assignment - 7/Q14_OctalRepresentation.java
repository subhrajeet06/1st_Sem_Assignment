import java.util.*;
public class Q14_OctalRepresentation {
	public static String decimalToOctal(int decimal)
	{
		int rev = 0,oct = 0;
		while (decimal != 0)
		{
			int temp = decimal % 8;
			rev = rev * 10 + temp;
			decimal /= 8;
		}
		while (rev != 0)
		{
			int temp = rev % 10;
			oct = oct * 10 + temp;
			rev /= 10;
		}
		return ""+oct;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number: ");
		int n = sc.nextInt();
		System.out.println("Octal equivalent: "+decimalToOctal(n));
	}
}