import java.util.*;
public class Q9_SumSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		double sum = 0;
		int c = 0;
		for (int i= 1;i <= n;i++)
		{
			sum += Math.pow(-1, i+1) * (2.0*i)/(2 * i - 1);
		}
		System.out.println(sum);
	}
}
