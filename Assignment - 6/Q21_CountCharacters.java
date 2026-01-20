import java.util.*;
public class Q21_CountCharacters {
	public static void countCharacters(String str)
	{
		char ch;
		int digit = 0,up = 0, lo = 0,sp = 0;
		for (int i = 0;i < str.length();i++)
		{
			ch = str.charAt(i);
			if(Character.isDigit(ch))
				digit++;
			else if (Character.isUpperCase(ch))
				up++;
			else if (Character.isLowerCase(ch))
				lo++;
			else
				sp++;
		}
		System.out.println("Uppercase Characters: "+up);
		System.out.println("Lowercase Characters: "+lo);
		System.out.println("Digits: "+digit);
		System.out.println("Special Characters: "+sp);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		countCharacters(s);
	}
}
