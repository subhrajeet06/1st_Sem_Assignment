import java.util.*;
public class Q12_VowelCount {
	public static int countVowels(String str)
	{
		int c = 0;
		for (int i = 0;i < str.length();i++)
		{
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				c++;
		}
		return c;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		s.toLowerCase();
		System.out.println("Number of vowels: "+countVowels(s));
	}
}
