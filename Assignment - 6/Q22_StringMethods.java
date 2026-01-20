import java.util.*;
public class Q22_StringMethods {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a strig: ");
		String s = sc.nextLine();
		System.out.println("Length of string: "+s.length());
		System.out.println("First Character: "+s.charAt(0));
		System.out.println("Last Character: "+s.charAt(s.length() - 1));
		System.out.println("String in Uppercase: "+s.toUpperCase());
		System.out.println("String in Lowercase: "+s.toLowerCase());
		System.out.println("Does the string contain \"Java\"? "+s.contains("Java"));
		System.out.println("Does the string start with \"Hello\"? "+s.startsWith("Hello"));
		System.out.println("Does the string end with \"World\"? "+s.endsWith("World"));
		System.out.println("Trimmed string: "+s.trim());
		System.out.println("String after replacing 'a' with '@': "+s.replace('a', '@'));
		System.out.println("Substring from index 2 to 7: "+s.substring(2,7));
	}
}
