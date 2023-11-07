import java.util.Scanner;

public class targetsum {
    static void target(int[] array, int sum) {
        int c = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == sum) {
                    System.out.println("( " + array[i] + " , " + array[j] + " )");
                    c++;
                }
            }
        }
        System.out.println("Total Outcomes: " + c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum, c = 0;
        System.out.print("Enter Array length: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target sum: ");
        sum = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println("( " + arr[i] + " , " + arr[j] + " )");
                    c++;
                }
            }
        }
        System.out.println("Total Outcomes: " + c);
        sc.close();
        // target(arr, sum);

    }
}