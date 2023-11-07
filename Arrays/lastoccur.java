import java.util.Scanner;
public class lastoccur
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            int n, last, pos = 0;
            System.out.print("Enter Array length: ");
            n = sc.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter Array elements: ");
            for(int i = 0; i < arr.length; i++)
            {
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter number: ");
            last = sc.nextInt();
            for(int i = 0; i < arr.length; i++)
            {
                if(arr[i] == last)
                {
                    pos = i;
                }
            }
            System.out.println("Last occurence of " + last + " at " + pos + "th position of Array");
        }
    }
}