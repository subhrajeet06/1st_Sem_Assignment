import java.util.*;
public class Q15_Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = 0,b = 1,c = 1;
		System.out.println("Enter n(n>3): ");
		int n = sc.nextInt();
		int sum = 0;
		System.out.print(a+" "+b+" "+c+" ");
		for (int i = 4;i <= n;i++)
		{
			sum = a + b + c;
			System.out.print(sum+" ");
			//int t = a;
			a = b;
			b = c;
			c = sum;
		}
		
	}

}
