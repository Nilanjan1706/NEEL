import java.util.Scanner;

public class secondLargest {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("ENTER ELEMENTS OF THE ARRAY");
            arr[i] = sc.nextInt();
        }
        int temp, size;
        size = arr.length;
        System.out.println("ARRAY SIZE IS : " + size);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("ELEMENT OF ARRAY IN ASCENDING ORDER IS : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("FOURTH LARGEST NUMBER IS : " + arr[size - 4]);
    }
}
