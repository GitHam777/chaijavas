import java.util.Scanner;

public class presentquery {

    static int[] makefrequencyarray(int[] array) {
        int[] freq = new int[100001];
        for (int i = 0; i < array.length; i++) {
            freq[array[i]]++;
        }
        return freq;
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
            int[] freq = makefrequencyarray(arr);
            System.out.print("Enter number of queries: ");
            int q = sc.nextInt();
            while (q > 0) {
                System.out.print("Enter number to be searched: ");
                int x = sc.nextInt();
                if (freq[x] > 0) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
                q--;
            }
        }
    }
}
