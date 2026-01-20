import java.util.*;
public class Q19_ConsecutiveNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int arr[] = {a,b,c};
		Arrays.sort(arr);
		if (arr[0]+1 == arr[1] && arr[1]+1 == arr[2])
			System.out.println("Consecutive numbers");
		else
			System.out.println("Not consectuvie numbers");
	}

}
