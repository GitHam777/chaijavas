import java.util.Scanner;

public class binarysort {

    static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static void swap(int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    static void sortzeroandone(int[] array) {
        int n = array.length;
        int z = 0;
        // count number of zeroes
        // 0 to z-1 --> put 0 z to n-1 --> put 1
        for (int i = 0; i < n; i++) {
            if (array[i] == 0) {
                z++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i < z) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Array size: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter zeroes or ones: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Original Array: ");
            print(arr);
            System.out.print("\nSorted Array: ");
            sortzeroandone(arr);
            print(arr);
        }
    }
}