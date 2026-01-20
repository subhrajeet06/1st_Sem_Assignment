import java.util.*;
public class Q8_LargestDigit {
	public static int largestDigit(int n)
	{
		int max = 0;
		while (n != 0)
		{
			int digit = n % 10;
			if (digit >= max)
				max = digit;
			n /= 10;
		}
		return max;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		System.out.println("Largest Digit: "+largestDigit(n));
	}
}
