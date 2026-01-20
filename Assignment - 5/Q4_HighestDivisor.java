import java.util.*;
public class Q4_HighestDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int maxDiv = 0,maxC = 0;
		for (int i = a;i <= b;i++)
		{
			int c = 0;
			for (int j = 1;j <= i;j++)
			{
				if (i % j == 0)
					c++;
			}
			if (c > maxDiv || (c == maxDiv && i > maxC))
			{
				maxDiv = c;
				maxC = i;
			}
		}
		System.out.println("Number with highest divisor: "+maxC);
		System.out.println("Highest Divisor: "+maxDiv);
	}

}
