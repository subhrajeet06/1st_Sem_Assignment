import java. util.*;
public class Q8_ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of units consumed");
		int unit = sc.nextInt();
		double rate = 0.0;
		if (unit >= 0 && unit <= 50)
			rate += 3 * unit;
		else if (unit > 50 && unit <= 200)
			rate += 4.80 * unit;
		else if (unit > 200 && unit <= 400)
			rate += 5.80 * unit;
		else if (unit > 400)
			rate += 6.20 * unit;
		else
		{
			System.out.println("Wrong unit entered");
			System.exit(0);
		}
		System.out.println("Do you want to pay your bill online? (y/n)");
		char ch = sc.next().charAt(0);
		if (ch == 'y')
		{
			double dis = 0.03 * rate;
			rate -= dis;
			System.out.println("Discounted amount: "+dis);
		}
		else if (ch == 'n')
			System.out.println("Total Electricity Bill: "+rate);
		else
		{
			System.out.println("Wrong choice entered");
			System.exit(0);
		}
		System.out.println("Total Electricity Bill: "+rate);
	}

}