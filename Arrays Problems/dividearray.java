import java.util.Scanner;

public class dividearray {
    static int arraySum(int[] array) {
        int totalsum = 0;
        for (int i = 0; i < array.length; i++) {
            totalsum = totalsum + array[i];
        }
        return totalsum;
    }

    static boolean equalSumPartition(int[] array) {
        int totalsum = arraySum(array);
        int presum = 0, sufsum;
        for (int i = 0; i < array.length; i++) {
            presum = presum + array[i];
            sufsum = totalsum - presum;
            if (sufsum == presum) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Probability of Array division: " + equalSumPartition(arr));
        sc.close();
    }
}