import java.util.*;
public class Q5_SecondLargest {
	public static int findSecondLargest(int[] arr)
	{
		int max = arr[0];
		int min = arr[1],temp;
		for (int i = 0;i < arr.length;i++)
		{
			if (arr[i] > max)
			{
				temp = max;
				max = arr[i];
				min = temp;
			}
		}
		return min;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements: ");
		for (int i = 0;i < arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Second Largest Number: "+findSecondLargest(arr));
	}
}
