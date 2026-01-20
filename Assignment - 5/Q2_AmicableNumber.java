import java.util.*;
public class Q2_AmicableNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum1 = 0,sum2 = 0;
		for (int i = 1;i <= a/2;i++)
		{
			if (a % i == 0)
				sum1 += i;
		}
		for (int j = 1;j <= b/2;j++)
		{
			if (b % j == 0)
				sum2 += j;
		}
		if (sum1 == b && sum2 == a)
			System.out.println("Amicable Number");
		else
			System.out.println("Not Amicable Number");
	}

}
