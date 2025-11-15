import java.util.*;
public class Q7_LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = sc.nextInt();
		String res = "";
		if (year % 4 == 0)
		{
			if (year % 400 == 0)
			res = "Leap year";
			else
				res = "Not leap year";
			if (year % 100 != 0)
				res = "Leap year";
			else
				res = "Not leap year";
		}
		else
			res = "Not leap year";
//		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
//			res = "Leap year";
//		else
//			res = "Not leap year";
		System.out.println(res);
	}

}
