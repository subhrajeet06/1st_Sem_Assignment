import java.util.*;
public class Q6_FriendlyPair {
	public static int sumOfDivisors(int n) 
	{
		int sum = 0;
		for (int i = 1;i <= n/2;i++)
		{
			if (n % i == 0)
				sum += i;
		}
		return sum;
	}
	public static boolean isFriendlyPair(int a, int b)
	{
		if (sumOfDivisors(a) / a == sumOfDivisors(b) / b)
			return true;
		else
			return false;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (isFriendlyPair(a,b))
			System.out.println("Friendly Pair");
		else
			System.out.println("Not Friendly Pair");
	}
}
