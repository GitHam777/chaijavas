import java.util.Scanner;

public class prefixsumNL {
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
        int[] arr = new int[n + 1];
        System.out.print("Enter Array elements: ");
        for (int i = 1; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        prefix(arr);

        System.out.print("Enter number of Queries: ");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.print("Enter range: ");
            int N = sc.nextInt();
            int L = sc.nextInt();
            int ans = arr[L] - arr[N - 1];
            System.out.println("Sum of part: " + ans);
        }
        sc.close();
    }
}
