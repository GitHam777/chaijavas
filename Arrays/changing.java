public class changing 
{
    static void print(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    static void change(int[] array)             // change is being done in Shallow Copy
    {
        for(int i = 0; i < array.length; i++)
        {
            array[i] = 0;
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,7,4,9};
        change(arr);
        print(arr);
    }
}
