import java.util.*;
public class Q12_BubbleSort {
	public static void bubbleSort(double[] arr)
	{
		for (int i = 0;i < arr.length - 1;i++)
		{
			for (int j = 0;j < arr.length - i - 1;j++)
			{
				if (arr[j] > arr[j+1])
				{
					double temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public static void readArray(double[] arr)
	{
		Scanner sc = new Scanner(System.in);
		for (int i = 0;i < arr.length;i++)
		{
			arr[i] = sc.nextDouble();
		}
	}
	public static void printArray(double[] arr)
	{
		for (int i = 0;i < arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = sc.nextInt();
		double arr[] = new double[n];
		System.out.println("Enter elements: ");
		readArray(arr);
		System.out.println("\nAfter sorting: ");
		bubbleSort(arr);
		printArray(arr);
	}
}
