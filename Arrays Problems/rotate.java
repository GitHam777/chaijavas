import java.util.Scanner;

public class rotate {
    static int[] rotation(int[] array, int step) {
        int j = 0;
        int n = array.length, k = step;
        k = k % n;
        int[] answer = new int[array.length];
        for (int i = n - k; i < n; i++) {
            answer[j++] = array[i];
        }
        for (int i = 0; i < n - k; i++) {
            answer[j++] = array[i];
        }
        return answer;
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
            System.out.print("Enter rotation value: ");
            int rotate = sc.nextInt();
            int[] ans = rotation(arr, rotate);
            System.out.print("Array after rotation: ");
            for (int i = 0; i < ans.length; i++) {
                System.out.print(ans[i] + " ");
            }
        }
    }
}