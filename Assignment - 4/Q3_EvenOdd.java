import java.util.*;
public class Q3_EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n;
		do
		{
			n = sc.nextInt();
			if (n==0) 
			{
				System.out.println("program terminated");break;
			}
			else if (n%2 == 0)
				System.out.println(n+" is an even number");
			else
				System.out.println(n+" is an odd number");
			
		}
		while(n != 0);
	}

}
