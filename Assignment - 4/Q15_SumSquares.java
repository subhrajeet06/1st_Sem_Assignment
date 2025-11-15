import java.util.*;
public class Q15_SumSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i,sum = 0,sq_sum = 0,sum_sq;
		for (i = 1;i <= 100;i++)
		{
			sq_sum += (int)Math.pow(i, 2);
			sum += i;
		}
		sum_sq = (int)Math.pow(sum, 2);
		System.out.println("The sum of squares of first 100 natural numbers: "+sq_sum);
		System.out.println("The squares of sum of first 100 natural numbers: "+sum_sq);
		System.out.println("Difference: "+(sum_sq - sq_sum));
	}

}
