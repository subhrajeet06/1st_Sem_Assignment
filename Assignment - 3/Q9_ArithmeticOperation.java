import java.util.*;
public class Q9_ArithmeticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Choose the operator (+,-,*,/)");
		char ch = sc.next().charAt(0);
		double res = 0;
		switch(ch)
		{
		case '+':
			res = a + b;
			break;
		case '-':
			res = a - b;
			break;
		case '*':
			res = a * b;
			break;
		case '/':
			if (b == 0)
				System.out.println("Division by zero is not allowed");
			else
			res = a/b;
			break;
		default:
			System.out.println("Invalid Operator");
		}
		System.out.println("Result: "+res);
	}

}
