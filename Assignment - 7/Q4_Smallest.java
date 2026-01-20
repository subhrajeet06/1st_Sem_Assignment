import java.util.*;
public class Q4_Smallest {
	public static double min(double[] arr)
	{
		double min = arr[0];
		for (int i = 0;i < arr.length;i++)
		{
			if (arr[i] < min)
				min = arr[i];
		}
		return min;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 numbers: ");
		double arr[] = new double[10];
		for (int i = 0;i < arr.length;i++)
			arr[i] = sc.nextDouble();
		System.out.println("Minimum number: "+min(arr));
	}
}
