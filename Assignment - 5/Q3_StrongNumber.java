import java.util.*;
public class Q3_StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int sum = 0,t = n;
		while (n != 0)
		{
			int temp = n % 10;
			int fact = 1;
			for (int i = 1;i <= temp;i++)
			{
				fact *= i;
			}
			sum += fact;
			n /= 10;
		}
		if (sum == t)
			System.out.println("Strong Number");
		else
			System.out.println("Not strong number");
	}

}
