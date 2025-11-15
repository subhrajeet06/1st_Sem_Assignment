import java.util.*;
public class Q7_MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int i;
		for (i = 1;i <= 3;i++)
			System.out.println(n+" * "+i+" = "+(n*i));
		i = 4;
		System.out.println();
		while(i <= 6)
		{
			System.out.println(n+" * "+i+" = "+(n*i));
			i++;
		}
		System.out.println();
		i = 7; 
		do
		{
			System.out.println(n+" * "+i+" = "+(n*i));
			i++;
		}
		while(i <= 10);
		
	}

}
