import java.util.*;
public class Q17_MiddleCharacter {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.next();
		if (s.length() % 2 == 0)
			System.out.println(s.charAt(s.length()/2));
		else
			System.out.println(s.charAt((s.length()+1)/2 - 1));
	}
}
