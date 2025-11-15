import java.util.*;
public class Q4_NumberGuessGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int rand = rd.nextInt(9)+1;
		if (n == rand)
			System.out.println("You got it right");
		else if (Math.abs(n-rand) == 1)
			System.out.println("Almost got it");
		else
			System.out.println("You got it wrong");
		
	}

}
