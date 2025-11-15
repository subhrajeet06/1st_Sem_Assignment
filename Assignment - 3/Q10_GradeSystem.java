import java.util.*;
public class Q10_GradeSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks: ");
		int mark = sc.nextInt();
		char grade = '\u0000';
		if (mark >= 0 && mark <= 100)
		{
			switch(mark/10)
			{
			case 10:
			case 9:
				grade = 'O';
				break;
			case 8:
				grade = 'A';
				break;
			case 7:
				grade = 'B';
				break;
			case 6:
				grade = 'C';
				break;
			case 5:
				grade = 'D';
				break;
			case 4:
				grade = 'E';
				break;
				default:
					grade = 'F';
			}
			System.out.println("Grade: "+grade);
		}
		else
			System.out.println("Invalid marks entered");
	}

}
