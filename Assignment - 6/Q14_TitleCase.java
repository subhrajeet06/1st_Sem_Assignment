import java.util.*;
public class Q14_TitleCase {
	public static String toTitleCase(String str)
	{
		String arr[] = str.split(" ");
		String res = "";
		for (int i = 0;i < arr.length;i++)
		{
			if (arr[i].length() > 0)
			{
				res += Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1) + " ";
			}
		}
		return res.strip();
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.nextLine();
		System.out.println("Converted String: "+toTitleCase(s));
	}
}
