import java.util.*;
public class Q3_PentagonalNumber {
	public static int getPentagonalNumber(int n)
	{
		return (int)n*(3*n-1)/2;
	}
	public static void main(String[] args)
	{
		int c = 0;
		for (int i = 1;i <= 10;i++)
		{
			for (int j = 1;j <= 10;j++)
			{
				c++;
				System.out.print(getPentagonalNumber(c)+" ");
			}
			System.out.println();
		}
	}
}
