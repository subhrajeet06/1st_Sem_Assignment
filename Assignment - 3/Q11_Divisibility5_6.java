import java.util.*;
public class Q11_Divisibility5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer");
		int n = sc.nextInt();
		if (n % 5 == 0)
			System.out.println(n+" is divisible by 5");
		if (n % 6 == 0)
			System.out.println(n+" is divisible by 6");
		if (n%5 == 0 && n % 6 == 0)
			System.out.println(n+" is divisible by both 5 and 6");
	}

}
