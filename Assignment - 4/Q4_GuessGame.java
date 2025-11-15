import java.util.*;
public class Q4_GuessGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int ch = rd.nextInt(10)+1;
		System.out.println("Enter a number");
		int n;
		do
		{
			n = sc.nextInt();
			if (n == ch)
			{
				System.out.println("Good guess!!");
				break;
			}
			if(n > ch)
				System.out.println("Too high, try again");
			else
				System.out.println("Too low, try again");
				
		}
		while(n != 0);
	}

}
