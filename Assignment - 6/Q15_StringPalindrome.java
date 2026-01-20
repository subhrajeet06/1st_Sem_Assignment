import java.util.*;
public class Q15_StringPalindrome {
	public static boolean isPalindrome(String str)
	{
		String s = "";
		String arr[] = str.toLowerCase().split("");
		int c = 1;
		//boolean flag = true;
		for (int i = 0;i < arr.length/2;i++)
		{
			if (!arr[i].equals(arr[arr.length - c]))
			{
				return false;
			}
			c++;
		}
		return true;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.next();
		if (isPalindrome(s))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}
