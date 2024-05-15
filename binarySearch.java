import java.util.*;

class Binary {
    int arr[] = new int[10];
    int key;

    void getData() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("ENTER ELEMENTS OF THE ARRAY");
            arr[i] = sc.nextInt();
        }
        System.out.println("ENTER THE ELEMENT TO SEARCH : ");
        key = sc.nextInt();
    }

    void search() {
        int i, j, mid, flag, pos;
        i = 0;
        j = 9;
        flag = 0;
        pos = 0;
        while (i <= j && flag == 0) {
            mid = (i + j) / 2;
            if (arr[mid] == key) {
                flag = 1;
                pos = mid + 1;
            }
            if (arr[mid] > key) {
                j = mid - 1;
            }
            if (arr[mid] < key) {
                i = mid + 1;
            }
        }
        if (flag == 0) {
            System.out.println("ELEMENT NOT FOUND...");
        } else {
            System.out.println("NUMBER FOUND AT POSITION : " + pos);
        }
    }
}

class binarySearch {
    public static void main(String[] args) {
        Binary obj = new Binary();
        obj.getData();
        obj.search();

    }
}