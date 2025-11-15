import java.util.*;
public class Q14_MonthYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int ch = rd.nextInt(12)+1;
		String month = "";
		switch(ch)
		{
		case 1:
			month = "January";
			break;
		case 2:
			month = "February";
			break;
		case 3:
			month = "March";
			break;
		case 4:
			month = "April";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "June";
			break;
		case 7:
			month = "July";
			break;
		case 8:
			month = "August";
			break;
		case 9:
			month = "September";
			break;
		case 10:
			month = "October";
			break;
		case 11:
			month = "November";
			break;
		default:
			month = "December";
		}
		System.out.println("Randomy Generated Number: "+ch);
		System.out.println("Corresponding Month: "+month);
	}

}
