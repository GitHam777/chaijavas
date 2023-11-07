import java.util.Scanner;

public class unique {
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
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        arr[i] = arr[j] = -1;
                    }
                }
            }
            System.out.print("Unique Numbers: ");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    System.out.print(arr[i] + " ");
                }
            }
        }

    }
}