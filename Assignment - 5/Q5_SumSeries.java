import java.util.*;
public class Q5_SumSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int sum = 0,sum1 = 0;
		for (int i = 1;i <= n;i++)
		{
			sum = 0;
			for (int j = 1;j <= i;j++)
			{
				sum += j;
			}
			sum1 += sum;
		}
		System.out.println("Sum: "+sum1);
	}

}