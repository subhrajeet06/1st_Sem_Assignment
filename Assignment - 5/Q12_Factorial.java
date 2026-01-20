import java.util.*;
public class Q12_Factorial {

	public static int Factorial(int n)
	{
		int fact = 1;
		for (int i = 1;i <= n;i++)
		{
			fact *= i;
		}
		return fact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range");
		int a = sc.nextInt();
		int b = sc.nextInt();
		for (int i = a;i <= b;i++)
		{
			System.out.print(Factorial(i)+" ");
		}
	}

}
