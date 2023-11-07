import java.util.Scanner;

public class reverse {
    static int[] revers(int[] array) {
        int[] reverse = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reverse[j++] = array[i];
        }
        return reverse;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n;
            System.out.print("Enter Array length: ");
            n = sc.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter Array elements: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int[] ans = revers(arr);
            System.out.print("Reverse of Array is: ");
            for (int i = 0; i < ans.length; i++) {
                System.out.print(ans[i] + " ");
            }
        }
    }
}