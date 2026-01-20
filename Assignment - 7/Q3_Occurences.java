import java.util.*;
public class Q3_Occurences {
	public static void readArray(int[] arr)
	{
		Scanner sc = new Scanner(System.in);
		for (int i = 0;i < 10;i++)
		{
			arr[i] = sc.nextInt();
		}
	}
	public static int countOccurrences(int[] arr, int key)
	{
		int c = 0;
		for (int i = 0;i < arr.length;i++)
		{
			if (arr[i] == key)
				c++;
		}
		return c;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 integers");
		int arr[] = new int[10];
		readArray(arr);
		System.out.println("Enter number to count: ");
		int key = sc.nextInt();
		System.out.println(key+" appears "+countOccurrences(arr,key)+" times");
	}
}
