import java.util.Scanner;

public class prefixsum2 {

    static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    static int[] prefix(int[] array) {
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + array[i];
        }
        return array;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Original Array: ");
        print(arr);
        System.out.print("Prefixsum Array: ");
        prefix(arr);
        print(arr);
        sc.close();
    }
}