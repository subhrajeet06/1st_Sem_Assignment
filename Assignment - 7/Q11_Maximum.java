import java.util.*;
public class Q11_Maximum {
	public static double max(double[] arr)
	{
		double max = arr[0];
		for (int i = 0;i < arr.length;i++)
			if (arr[i] > max)
				max = arr[i];
		return max;
	}
	public static void readArray(double[] arr)
	{
		Scanner sc = new Scanner(System.in);
		for (int i = 0;i < arr.length;i++)
		{
			arr[i] = sc.nextDouble();
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double arr[] = new double[10];
		System.out.println("Enter elements: ");
		readArray(arr);
		System.out.println("Maximum value: "+max(arr));
	}
}
