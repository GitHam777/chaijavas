import java.util.Scanner;
public class input 
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner (System.in)) {
            int n;
            System.out.print("Enter Array Size: ");
            n = sc.nextInt();
            int[] array = new int[n];
            System.out.print("Enter Array elements: ");
            for(int i = 0; i < array.length; i++)
            {
                array[i] = sc.nextInt();
            }
            System.out.print("The Array is: ");
            for(int i = 0; i < array.length; i++)
            {
                System.out.print(array[i] + " ");
            }
        }
    }
}

