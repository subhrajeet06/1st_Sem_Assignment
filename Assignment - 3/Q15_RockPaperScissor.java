import java.util.*;
public class Q15_RockPaperScissor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int ch = (int)(Math.random()*3);
		System.out.println("Scissor(0), Rock(1), Paper(2): ");
		int n = sc.nextInt();
		if (ch == 2 && n == 0)
			System.out.println("The computer is Paper. You are Scissor. You won");
		else if (ch == 1 && n == 2)
			System.out.println("The computer is Rock. You are Paper. You won");
		else if (ch == 0 && n == 1)
			System.out.println("The computer is Scissor. You are Rock. You won");
		else if (ch < 0 && ch > 2)
			System.out.println("Wrong choice");
		else if (ch == n)
			System.out.println("Match is draw");
		else
			System.out.println("You lost");
	}

}
