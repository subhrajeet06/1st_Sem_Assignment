import java.util.*;
public class Q14_CosineSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of x: ");
		double x = sc.nextDouble();
		double sum = 1,term = 1;
		int sign = -1,i = 0;
		while (term > 0.000001)
		{
			i += 2;
			term *= (x*x)/(i*(i-1));
			sum += sign * term;
			sign = -sign;
		}
		System.out.println(sum);
	}

}
