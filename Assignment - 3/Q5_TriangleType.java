import java.util.*;
public class Q5_TriangleType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 sides of a triangle");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		String triangle = "";
		if (a+b > c && b+c > a && c+a > b)
		{
			if (a == b && b == c)
				triangle = "Equilateral";
			else if (a == b || b == c || c == a)
				triangle = "Isosceles";
			else
				triangle = "Scalene";
		}
		else
			triangle = "Triangle not possible";
		System.out.println(triangle);
	}

}
