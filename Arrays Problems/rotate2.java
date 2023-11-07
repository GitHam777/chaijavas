import java.util.Scanner;

public class rotate2 {
    static void swap(int[] array, int i, int j) {
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    static void reverse(int[] array, int start, int end) {
        while (start < end) {
            swap(array, start, end);
            start++;
            end--;
        }
    }

    static void rotation(int[] array, int step) {
        int n = array.length, k = step;
        k = k % n;
        reverse(array, 0, n - k - 1);
        reverse(array, n - k, n - 1);
        reverse(array, 0, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter Array length: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter rotation value: ");
        int rotate = sc.nextInt();
        rotation(arr, rotate);
        System.out.print("Array after rotation: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}