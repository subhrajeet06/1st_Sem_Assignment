import java.util.*;
public class Q13_WordCount {
	public static int countWords(String str)
	{
		return str.strip().split("\\s+").length;
		/*int c = 0;
		for (int i = 0;i < str.length();i++)
		{
			if (str.charAt(i) != ' ')
				c++;
		}
		return c+1;*/
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter a string: ");
		String s = sc.nextLine();
		System.out.println("Number of words: "+countWords(s));
	}
}
