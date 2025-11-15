import java.util.*;
public class Q12_LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		//Using if-else-if ladder
		if (a > b && a > c)
			System.out.println(a+" is largest");
		else if (b > a && b > c)
			System.out.println(b+" is largest");
		else
			System.out.println(c+" is largest");
		//Using nested if-else
		if (a>b)
		{
			if (a>c)
				System.out.println(a+" is largest");
			else
				System.out.println(c+" is largest");
		}
		else
			if (b > c)
				System.out.println(b+" is largest");
			else
				System.out.println(c+" is largest");
		//Using ternary operator
		int res = (a>b)?((a>c)? a:c):((b>c)?b:c);
		System.out.println("Largest number: "+res);
	}

}
