import java.util.*;
public class Q2_Steps {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of steps");
		int step = sc.nextInt();
		if (step >= 10000)
			System.out.println("Good job!! You are active today");
		else
			System.out.println("You need to walk more for good health");

	}

}
