import java.util.Arrays;
public class cloningdeep
{
    static void print(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 7, 4, 9};
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        System.out.print("Original Array: ");
        print(arr);
        System.out.print("Copied Array: ");
        print(arr2);
        arr2[0] = 100;
        System.out.print("Original Array after change: ");
        print(arr);
        System.out.print("Copied Array after change: ");
        print(arr2);
    }
}
