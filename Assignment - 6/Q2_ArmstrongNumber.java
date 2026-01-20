import java.util.*;
public class Q2_ArmstrongNumber {

	public static boolean isArmstrong(int n)
	{
		int sum = 0,t = n;
		int digit = countDigits(n);
		while (n != 0)
		{
			int temp = n % 10;
			sum += power(temp,digit);
			n /= 10;
		}
		if (sum == t)
			return true;
		else
			return false;
	}
	public static int countDigits(int n) 
	{
		int c = 0;
		while (n != 0)
		{
			c++;
			n /= 10;
		}
		return c;
	}
	public static int power(int a, int b)
	{
		return (int)Math.pow(a, b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for (int i = 100;i <= 10000;i++)
		{
			if (isArmstrong(i))
				System.out.print(i+" ");
		}
	}

}
