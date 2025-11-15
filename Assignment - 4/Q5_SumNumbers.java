import java.util.*;
public class Q5_SumNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		System.out.println("Enter third number");
		int c = sc.nextInt();
		int i,sum = 0;
		for (i = a;i <= b;i+=c)
		{
			System.out.print(i+"\t");
			sum += i;
		}
		System.out.println("\nThe sum of number displayed = "+sum);
	}

}
