import java.util.*;
public class Q1_Sum {
	public static int findSum(int[] arr)
	{
		int sum = 0;
		for (int i = 0;i < arr.length;i++)
		{
			sum += arr[i];
		}
		return sum;
	}
	public static double findAverage(int[] arr)
	{
		return (double)findSum(arr)/arr.length;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.println("Enter number of elements: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Random values: ");
		for (int i = 0;i < n;i++)
		{
			arr[i] = r.nextInt(50)+1;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Sum: "+findSum(arr));
		System.out.println("Average: "+findAverage(arr));
	}
}
