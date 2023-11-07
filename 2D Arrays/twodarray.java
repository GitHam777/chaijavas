import java.util.Scanner;

public class twodarray
{
    static void printarray(int[][] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int r = sc.nextInt();
        System.out.print("Enter columms: ");
        int c = sc.nextInt();
        int[][] array = new int[r][c];
        System.out.print("Enter 2D Array elements: ");
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                array[i][j] = sc.nextInt();
            }
        }
        printarray(array);
        sc.close();
    }
}