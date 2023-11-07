import java.util.Scanner;

public class sortsq {
    static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static void swap(int[] array, int i, int j) {
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    static void reverse(int[] array) {
        int i = 0, j = array.length - 1;
        while (i < j) {
            swap(array, i, j);
            i++;
            j--;
        }
    }

    static int[] sortsquare(int[] array) {
        int n = array.length;
        int left = 0, right = n - 1;
        int[] answer = new int[n];
        int k = 0;
        while (left <= right) {
            if (Math.abs(array[left]) > Math.abs(array[right])) {
                answer[k++] = array[left] * array[left];
                left++;
            } else {
                answer[k++] = array[right] * array[right];
                right--;
            }
        }
        return answer;
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
        System.out.print("Original Array: ");
        print(arr);
        int[] ans = sortsquare(arr);
        System.out.print("\nSorted Array: ");
        reverse(ans);
        print(ans);
        sc.close();
    }
}

// Original Array : -10 -5 -2 1 4 9
// Sorted Array: 1 4 16 25 81 100