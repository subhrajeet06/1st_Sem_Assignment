import java.util.*;
public class Q7_YearDays {
	public static int numberOfDaysInAYear(int year)
	{
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
			return 366;
		else
			return 365;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		for (int i = 2000;i <= 2020;i++)
		{
			System.out.println(i+" has "+numberOfDaysInAYear(i)+" days");
		}
	}
}
