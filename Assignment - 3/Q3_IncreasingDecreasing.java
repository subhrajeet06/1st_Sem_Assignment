import java.util.*;
public class Q3_IncreasingDecreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number");
		int b = sc.nextInt();
		System.out.println("Enter 3rd number");
		int c = sc.nextInt();
		if (a > b && b > c)
			System.out.println("Decreasing");
		else if (a < b && b < c)
			System.out.println("Increasing");
		else
			System.out.println("Neither increasing nor decreasing");
	}

}
