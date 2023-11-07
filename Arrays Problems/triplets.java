import java.util.Scanner;
public class triplets
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in))
        {
            int n, sum, c = 0;
            System.out.print("Enter Array length: ");
            n = sc.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter Array elements: ");
            for(int i = 0; i < arr.length; i++)
            {
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter target sum: ");
            sum = sc.nextInt();
            for(int i = 0; i < arr.length; i++)
            {
                for(int j = i + 1; j < arr.length; j++)
                {
                    for(int k = j + 1; k < arr.length; k++)
                    {
                        if( arr[i] + arr[j] + arr[k] == sum )
                        {
                            System.out.println("( " + arr[i] + " , " + arr[j] + " , " + arr[k] + " )");
                            c++;
                        }
                    }
                }
            }
            System.out.println("Total Outcomes: " + c);
        }
    }
}