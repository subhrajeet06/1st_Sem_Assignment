import java.util.*;
public class Q13_Multiple3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1;i < n;i++)
		{
			if (i % 3 == 0 || i % 5 == 0)
			{
				sum += i;
			}
		}
		System.out.println("The sum of all multiples of 3 and 5 below "+n+" is = "+sum);
	}

}
