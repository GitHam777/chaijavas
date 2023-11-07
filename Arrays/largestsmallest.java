import java.util.Scanner;
public class largestsmallest
{
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            int n;
            System.out.print("Enter Array size: ");
            n = sc.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter Array elements: ");
            for(int i = 0; i < arr.length; i++)
            {
                arr[i] = sc.nextInt();
            }
            int max, min;
            max = min = arr[0];
            for(int i = 0; i < arr.length; i++)
            {
                if(arr[i] > max)
                {
                    max = arr[i];
                }
                if(arr[i] < min)
                {
                    min = arr[i];
                }
            }
            System.out.print("Max element : Min element = ( " + max + " , " + min + " )");
        }
    }
}