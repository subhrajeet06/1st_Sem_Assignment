import java.util.*;
public class Q2_CountOccurences {
	public static void readInput(int[] counts)
	{
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter size of array: ");
//		int n = sc.nextInt();
//		System.out.println("Enter elements: ");
//		int arr[] = new int[n];
//		for (int i = 0;i < n;i++)
//		{
//			arr[i] = sc.nextInt();
//		}
		int n;
		while (true)
		{
			n = sc.nextInt();
			if (n == 0)
				break;
		}
	}
	public static void displayCounts(int[] counts) {
	    for (int i = 1; i <= 100; i++) {
	        if (counts[i] > 0) {
	            if (counts[i] == 1)
	                System.out.println(i + " occurs 1 time");
	            else
	                System.out.println(i + " occurs " + counts[i] + " times");
	        }
	    }
	}
	public static void main(String[] args) {
        int[] counts = new int[101];

        readInput(counts);
        displayCounts(counts);
    }

}
