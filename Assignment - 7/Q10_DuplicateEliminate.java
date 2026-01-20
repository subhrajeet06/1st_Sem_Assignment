import java.util.*;
public class Q10_DuplicateEliminate {
	public static int[] eliminateDuplicates(int[] list) {
        int[] temp = new int[list.length];
        int count = 0;

        for (int i = 0; i < list.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < count; j++) {
                if (list[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[count] = list[i];
                count++;
            }
        }

        // Create result array of exact size
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            list[i] = sc.nextInt();
        }

        int[] distinct = eliminateDuplicates(list);

        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < distinct.length; i++) {
            System.out.print(distinct[i] + " ");
        }
    }
}
