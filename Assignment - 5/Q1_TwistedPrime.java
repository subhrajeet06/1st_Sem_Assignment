import java.util.*;
public class Q1_TwistedPrime {

	public static boolean isPrime(int n)
	{
		int flag = 0;
		
		for (int i = 2;i < n/2;i++)
		{
			if (n % i == 0)
			{
				flag++;
				break;
			}
		}
		if (n == 1)
		{
			return false;
			//break;
		}
		else if (flag != 0)
			return false;
		else
			return true;
	}
	
	public static boolean reverse(int n)
	{
		int rev = 0,t = n;
		while (n != 0)
		{
			int temp = n % 10;
			rev *= 10 + temp;
			n /= 10;
		}
		if (isPrime(rev))
			return true;
		else
			return false;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		if (isPrime(n) && reverse(n))
			System.out.println("Twisted Prime");
		else
			System.out.println("Now twisted prime");
	}

}
