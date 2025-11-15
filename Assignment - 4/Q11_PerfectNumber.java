import java.util.*;
public class Q11_PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int i = 1,factor = 0,t = n,sum = 0;
		while(i <= n/2)
		{
			if (n % i == 0)
			{
				sum += i;
			}
			i++;
		}
		if (sum == t)
			System.out.println(t+" is a Perfect Number");
		else
			System.out.println(t+" is not a Perfect Number");
	}

}
