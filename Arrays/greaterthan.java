import java.util.Scanner;
public class greaterthan
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            int n, num, c = 0;
            System.out.print("Enter Array size: ");
            n = sc.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter Array elements: ");
            for(int i = 0; i < arr.length; i++)
            {
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter the number to search: ");
            num = sc.nextInt();
            for(int i = 0; i < arr.length; i++)
            {
                if(arr[i] > num)
                {
                    c++;
                }
            }
            System.out.print("Elements greater than " + num + " is: " + c);
        }


    }
}