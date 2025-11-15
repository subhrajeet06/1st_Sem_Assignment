import java.util.*;
public class Q12_BasePower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base");
		int base = sc.nextInt();
		System.out.println("Enter the power");
		int pow = sc.nextInt();
		int i = 1,res = 1;
		while (i <= pow)
		{
			res *= base;
			i++;
		}
		System.out.println(base+" to the power "+pow+" = "+res);
	}

}
