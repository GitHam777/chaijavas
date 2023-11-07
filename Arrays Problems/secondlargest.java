import java.util.Scanner;
public class secondlargest
{
    static int largest(int[] array)
    {
        int max = array[0];
        int maxid = 0;
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] > max)
            {
                maxid = i;
            }
        }
        return maxid;
    }
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            int n;
            System.out.print("Enter Array length: ");
            n = sc.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter Array elements: ");
            for(int i = 0; i < arr.length; i++)
            {
                arr[i] = sc.nextInt();
            }
            int maxid = largest(arr);
            arr[maxid] = Integer.MIN_VALUE;
            int max2nd = arr[0];
            for(int i = 0; i < arr.length; i++)
            {
                if(arr[i] > max2nd)
                {
                    max2nd = arr[i];
                }
            }
            System.out.print("Second Largest element: " + max2nd);
        }

    }
}