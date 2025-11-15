import java.util.*;
public class Q6_QuadraticRoots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a,b,c");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		double d = Math.pow(b, 2) - 4*a*c;
		double r1 = (-b + Math.sqrt(d))/(2*a);
		double r2 = (-b - Math.sqrt(a))/(2*a);
		if (d > 0)
			System.out.println("2 Real roots "+r1+" and "+r2);
		else if (d < 0)
			System.out.println("No real roots");
		else
			System.out.println("Equation has one root "+r1);		
	}

}
