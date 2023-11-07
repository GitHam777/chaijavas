import java.util.Scanner;

public class prefixsum {
    static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    /*
     * static int[] prefix(int[] array) {
     * int s = 0;
     * int[] ans = new int[array.length];
     * for (int i = 0; i < array.length; i++) {
     * for (int j = 0; j <= i; j++) {
     * s = s + array[j];
     * }
     * ans[i] = s;
     * s = 0;
     * }
     * return ans;
     * }
     */

    static int[] prefix(int[] array) {
        int[] pref = new int[array.length];
        pref[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            pref[i] = pref[i - 1] + array[i];
        }
        return pref;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int[] ans = prefix(arr);
        print(ans);
    }
}