import java.util.*;
public class Q10_RemoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int digit,temp = 0, p = 1;
		//String i = "";
		while (n != 0)
		{
			digit = n % 10;
			if (digit != 0)
			{
				temp += digit * p;
				p *= 10;
			}
			n /= 10;
		}
		System.out.println("After removing zeros, number is: "+temp);
	}

}