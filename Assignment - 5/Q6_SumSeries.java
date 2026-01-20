import java.util.*;
public class Q6_SumSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		double sum = 0;
		for (int i = 1;i <= n;i++)
		{
			sum += 1.0/Math.pow(i, 2);
		}
		System.out.println("Sum = "+sum);
	}

}
