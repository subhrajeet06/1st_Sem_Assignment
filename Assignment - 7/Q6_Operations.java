import java.util.*;
public class Q6_Operations {
	public static void readArray(int[] arr)
	{
		Scanner sc = new Scanner(System.in);
		for (int i = 0;i < arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
	}
	public static int findMax(int[] arr)
	{
		int max = arr[0];
		for (int i = 0;i < arr.length;i++)
			if (arr[i] > max)
				max = arr[i];
		return max;
	}
	public static int findMin(int[] arr)
	{
		int min = arr[0];
		for (int i = 0;i < arr.length;i++)
		{
			if (arr[i] < min)
				min = arr[i];
		}
		return min;
	}
	public static int countOccurrences(int[] arr, int value)
	{
		int c = 0;
		for (int i = 0;i < arr.length;i++)
		{
			if (arr[i] == value)
				c++;
		}
		return c;
	}
	public static int firstPositionOfMax(int[] arr, int max)
	{
		int pos = 0;
		for (int i = 0;i < arr.length;i++)
		{
			if (arr[i] == max)
			{
				pos = i;
				break;
			}
		}
		return pos+1;
	}
	public static int lastPositionOfMin(int[] arr, int min)
	{
		int pos = 0;
		for (int i = arr.length - 1;i > 0;i--)
		{
			if (arr[i] == min)
			{
				pos = i;
				break;
			}
		}
		return pos+1;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter values: ");
		readArray(arr);
		System.out.println("Maximum value: "+findMax(arr));
		System.out.println("It occurs "+countOccurrences(arr,findMax(arr))+" times");
		System.out.println("First position of maximum: "+firstPositionOfMax(arr,findMax(arr)));
		System.out.println("\nMinimum value: "+findMin(arr));
		System.out.println("It occurs "+countOccurrences(arr,findMin(arr))+" times");
		System.out.println("Last position of minimum: "+lastPositionOfMin(arr,findMin(arr)));
	}
}
