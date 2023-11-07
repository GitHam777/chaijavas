public class copying 
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
        int[] arr = {1, 7, 3, 5, 4};
        int[] arr2 = arr;
        arr2[0] = 9;
        System.out.print("Original Array: ");
        print(arr);
        System.out.print("Copied Array: ");
        print(arr2);
    }
}
