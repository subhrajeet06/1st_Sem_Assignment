import java.util.*;
public class Q11_CharacterCount {
	public static int count(String str, char a)
	{
		int c = 0;
		for (int i = 0;i < str.length();i++)
		{
			if (str.charAt(i) == a)
				c++;
		}
		return c;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String s = sc.nextLine();
		System.out.println("Enter character to count: ");
		char ch = sc.next().charAt(0);
		s = s.toLowerCase();
		ch = Character.toLowerCase(ch);
		if (count(s,ch) == 0)
			System.out.println("Character not found");
		else
			System.out.println("Number of occurences: "+count(s,ch));
	}
}
