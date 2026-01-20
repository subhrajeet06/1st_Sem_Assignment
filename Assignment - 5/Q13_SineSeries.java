import java.util.*;
public class Q13_SineSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter a number");
		double x = sc.nextDouble();
		int sign = -1,i = 1;
		double term = x,sum = x;
		while (term > 0.000001)
		{
			i += 2;
			term *= (x*x)/(i*(i*(i-1)));
			sum += sign*term;
			sign = -sign;
		}
		System.out.println(sum);
	}

}
