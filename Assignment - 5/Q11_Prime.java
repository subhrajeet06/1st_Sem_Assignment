import java.util.*;
public class Q11_Prime {
	
	/*public static boolean isPrime(int n)
	{
		//int flag = 0;
		if (n <= 1)
			//flag++;
			return false;
			for (int i = 2;i <= n/2;i++)
			{
				if (n % i == 0)
				{
					return false;
					//break;
				}
			}
//		if (flag == 0)
//			return true;
//		else
//			return false;
			return true;
	}*/
	public static boolean isPrime(int n)
	{
		if (n <= 1)
			return false;
		for (int i = 2;i * i <= n;i++)
		{
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range");
		int a = sc.nextInt();
		int b = sc.nextInt();
		for (int i = a;i <= b;i++)
		{
			if (isPrime(i))
				System.out.print(i+" ");
		}
	}

}
