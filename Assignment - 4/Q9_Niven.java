import java.util.*;
public class Q9_Niven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int temp,t = n,sum = 0;
		while(n != 0)
		{
			temp = n % 10;
			sum += temp;
			n /= 10;
		}
		if (t % sum == 0)
			System.out.println(t+" is a Niven Number");
		else
			System.out.println(t+" is not a Niven Number");
	}

}
