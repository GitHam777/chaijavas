import java.util.Scanner;

public class secondsmallest {
    static int smallest(int[] array) {
        int min = array[0];
        int minid = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                minid = i;
            }
        }
        return minid;
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
            int minid = smallest(arr);
            arr[minid] = Integer.MAX_VALUE;
            int min2nd = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min2nd) {
                    min2nd = arr[i];
                }
            }
            System.out.print("Second Smallest element: " + min2nd);
        }
    }
}