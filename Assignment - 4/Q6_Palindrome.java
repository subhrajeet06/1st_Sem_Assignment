import java.util.*;
public class Q6_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int temp,t = n,rev = 0;
		while(n != 0)
		{
			temp = n % 10;
			rev *= 10 + temp;
			n /= 10;
		}
		if (rev == t)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

}
