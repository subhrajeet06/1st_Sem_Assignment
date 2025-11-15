import java.util.*;
public class Q13_Quadrant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter coordinates (x,y): ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		String quad = "";
		if (x > 0 && y > 0)
			quad = "Quadrant I";
		else if (x < 0 && y > 0)
			quad = "Quadrant II";
		else if (x < 0 && y < 0)
			quad = "Quadrant III";
		else if (x > 0 && y < 0)
			quad = "Quadrant IV";
		else if (x == 0 && y != 0)
			quad = "Y-axis";
		else if (y == 0 && x != 0)
			quad = "X-axis";
		else
			quad = "Origin";
		System.out.println("("+x+","+y+") is in "+quad);
			
	}

}
