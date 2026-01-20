import java.util.*;
public class Q13_Reverse {
	public static void fillArray(int[] arr)
	{
		Random r = new Random();
		//Scanner sc = new Scanner(System.in);
		for (int i = 0;i < arr.length;i++)
		{
			arr[i] = r.nextInt(50,101);
		}
	}
	public static void printArray(int[] arr)
	{
		for (int i = 0;i < arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	//Using a new array
	public static int[] reverseArray1(int[] arr)
	{
		int rev[] = new int[arr.length];
		int c = 0;
		for (int i = arr.length - 1;i >= 0;i--)
		{
			rev[c] = arr[i];
			c++;
		}
		return rev;
	}
	//Without using new ARRAY (Preferred)
	public static void reverseArray(int[] arr)
	{
		int start = 0,end = arr.length - 1;
		while (start < end)
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		fillArray(arr);
		System.out.println("Before reversal: ");
		printArray(arr);
		System.out.println("\nAfter reversal: ");
		reverseArray(arr);
		printArray(arr); //
		
	}
}
