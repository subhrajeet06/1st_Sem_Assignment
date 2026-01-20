import java.util.*;
public class Q15_ZeroFormatting {
	public static void main(String args[])
	{
		//input the array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 integers: ");
		int arr[] = new int[10];
		for (int i = 0;i < arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		//formatting all the zeros to left
		int arr1[] = new int[arr.length];
		int c = arr.length - 1;
		for (int i = arr.length - 1;i >= 0;i--)
		{
			if (arr[i] != 0)
			{
				arr1[c] = arr[i];
				c--;
			}
			//System.out.println(c+" "+i);
		}
		
		//for displaying the result
		System.out.println("After moving all zeros to left: ");
		for (int i = 0;i < arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
	}
}