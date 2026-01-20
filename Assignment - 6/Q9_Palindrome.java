import java.util.*;
public class Q9_Palindrome {
	public static int reverse(int n)
	{
		int rev = 0;
		while(n != 0)
		{
			int c = n % 10;
			rev = rev * 10 + c;
			n /= 10;
		}
		return rev;
	}
	public static boolean isPalindrome(int n)
	{
		if (reverse(n) == n)
			return true;
		else
			return false;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		if (isPalindrome(n))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}
