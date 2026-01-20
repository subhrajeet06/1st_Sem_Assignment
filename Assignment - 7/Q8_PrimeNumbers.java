import java.util.*;
public class Q8_PrimeNumbers {
	public static void fillArray(int[] arr)
	{
		Random r = new Random();
		//Scanner sc = new Scanner(System.in);
		for (int i = 0;i < arr.length;i++)
		{
			arr[i] = r.nextInt(2,31);
		}
	}
	public static void printArray(int[] arr)
	{
		for (int i = 0;i < arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static boolean isPrime(int num)
	{
		if (num < 2)
			return false;
		if (num == 2)
			return true;
		if (num % 2 == 0)
			return false;
		for (int i = 3;i*i <= num;i+=2)
		{
			if (num % i == 0)
				return false;
		}
		return true;
	}
	public static int countPrimes(int[] arr)
	{
		int c = 0;
		for (int i = 0;i < arr.length;i++)
		{
			if (isPrime(arr[i]))
				c++;
		}
		return c;
	}
	public static void main(String[] args)
	{
		int arr[] = new int[10];
		fillArray(arr);
		System.out.println("Array elements: ");
		printArray(arr);
		System.out.println("\nNumber of prime numbers: "+countPrimes(arr));
	}
}
