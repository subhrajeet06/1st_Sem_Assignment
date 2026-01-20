import java.util.*;
public class Q16_Password {
	public static boolean isValidPassword(String pass)
	{
		int c = 0;
		if (pass.length() < 8)
			return false;
		for (int i = 0;i < pass.length();i++)
		{
			if (!Character.isLetterOrDigit(pass.charAt(i)))
				return false;
			if (Character.isDigit(pass.charAt(i)))
				c++;
		}
		if (c < 2)
			return false;
		return true;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password: ");
		String s = sc.next();
		if (isValidPassword(s))
			System.out.println("Valid Password");
		else
			System.out.println("Invalid Password");
	}
}
