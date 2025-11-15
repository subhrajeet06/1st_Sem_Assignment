import java.util.*;
public class Q1_Divisibility9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int temp,sum = 0,t = n;
		while(n != 0)
		{
			temp = n % 10;
			sum += temp;
			n /= 10;
		}
		//System.out.println(sum);
		if (sum == t)
			System.out.println(t+" is divisible by 9");
		else
			System.out.println(t+" is not divisible by 9");
	}

}
