import java.util.*;

public class largestAndSmallestElementInAnArray {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("ENTER ELEMENTS OF THE ARRAY");
            arr[i] = sc.nextInt();
        }
        int val = arr[0];
        int low = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > val) {
                val = arr[i];
            }
            if (arr[i] < low) {
                low = arr[i];
            }
        }
        System.out.println("THE LARGEST NUMBER IS : " + val + " AND THE SMALLEST NUMBER IS : " + low);
    }
}
