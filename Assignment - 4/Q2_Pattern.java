import java.util.*;
public class Q2_Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter number of rows: ");
		int r = sc.nextInt();
		String s = "1";
		System.out.println(s);
		for(int i=2;i<=r;i++)
			{s= s + i + s;
		System.out.println(s);}

	}

}
