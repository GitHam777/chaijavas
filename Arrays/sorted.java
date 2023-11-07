import java.util.Scanner;
public class sorted
{
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            int n;
            boolean a = true, d = true;
            System.out.print("Enter Array size: ");
            n = sc.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter Array elements: ");
            for(int i = 0; i < arr.length; i++)
            {
                arr[i] = sc.nextInt();
            }
            for(int i = 0; i < arr.length - 1; i++) //ascending case
            {
                if(arr[i] > arr[i+1])
                {
                    a = false;
                    break;
                }
            }
            for(int i = 1; i < arr.length; i++) //descending case
            {
                if(arr[i-1] < arr[i])
                {
                    d = false;
                    break;
                }
            }
            if(a == false && d == false)
            {
                System.out.println("Array is not sorted");
            }
            else
            {
                System.out.println("Array is sorted");
            }
        }
    }
}