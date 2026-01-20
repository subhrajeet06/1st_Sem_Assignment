import java.util.*;
public class Q7_ClockwiseRotation {
	public static void readArray(int[] arr)
	{
		Scanner sc = new Scanner(System.in);
		for (int i = 0;i < arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
	}
	public static void rotateClockwise(int[] arr)
	{
		int first = arr[arr.length - 1];
		for (int i = arr.length - 1;i > 0;i--)
		{
			arr[i] = arr[i - 1];
		}
		arr[0] = first;
	}
	public static void printArray(int[] arr)
	{
		for (int i = 0;i < arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Enter 10 integers: ");
		int arr[] = new int[10];
		readArray(arr);
		System.out.println("Before rotation: ");
		printArray(arr);
		System.out.println("\nAfter rotation: ");
		rotateClockwise(arr);
		printArray(arr);
	}
}
