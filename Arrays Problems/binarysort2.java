import java.util.Scanner;

public class binarysort2 {

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
        int left = 0, right = n - 1;
        while (left < right) {
            if (array[left] == 1 && array[right] == 0) {
                swap(array, left, right);
                left++;
                right--;
            }
            if (array[left] == 0) {
                left++;
            }
            if (array[right] == 1) {
                right--;
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