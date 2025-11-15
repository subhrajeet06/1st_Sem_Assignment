import java.util.*;
public class Q14_SumProductEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range");
		int n = sc.nextInt();
		int i,sum = 0,prod = 1;
		for (i = 1;i <= n;i++)
		{
			if (i%2 == 0)
				sum += i;
			else
				prod *= i;
		}
		System.out.println("Sum of all even numbers = "+sum);
		System.out.println("Sum of all odd numbers = "+prod);
	}

}
