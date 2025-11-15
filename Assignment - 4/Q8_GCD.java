import java.util.*;
public class Q8_GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int x = sc.nextInt();
		System.out.println("Enter second number");
		int y = sc.nextInt();
		int a = x;
		int b = y,temp;
		while (b != 0)
		{
			temp = a % b;
			a = b;
			b = temp;
		}
		System.out.println("GCD of "+x+" and "+y+" is: "+a);
	}

}
