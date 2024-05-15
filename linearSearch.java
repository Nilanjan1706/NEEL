import java.util.*;

class Linear {
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
        int i;
        int flag = 0;
        int pos = 0;
        int index = 0;
        for (i = 0; i < arr.length && flag == 0; i++) {
            if (arr[i] == key) {
                flag = 1;
                pos = i + 1;
                index = i;
            }
        }
        if (flag == 1) {
            System.out.println("ELEMENT FOUNT AT POSITION " + pos + " AND AT INDEX " + index);
        } else {
            System.out.println("ELEMENT NOT FOUND....");
        }
    }
}

class linearSearch {
    public static void main(String[] args) {
        Linear obj = new Linear();
        obj.getData();
        obj.search();
    }
}