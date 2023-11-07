import java.util.Scanner;

public class sum
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

    static void add(int[][] a, int r1, int c1, int[][] b, int r2, int c2)
    {
        if((r1 != r2) || (c1 != c2))
        {
            System.out.print("Wrong Input");
            return;
        }
        int[][] sum = new int[r1][c1];
        for(int i = 0; i < r1; i++)
        {
            for(int j = 0; j < c1; j++)
            {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("The Sum Matrix: ");
        printarray(sum);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows of A: ");
        int r1 = sc.nextInt();
        System.out.print("Enter columms of A: ");
        int c1 = sc.nextInt();
        int[][] array1 = new int[r1][c1];
        System.out.print("Enter elements of 2D Array A: ");
        for(int i = 0; i < r1; i++)
        {
            for(int j = 0; j < c1; j++)
            {
                array1[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter rows of B: ");
        int r2 = sc.nextInt();
        System.out.print("Enter columms of B: ");
        int c2 = sc.nextInt();
        int[][] array2 = new int[r2][c2];
        System.out.print("Enter elements of 2D Array B: ");
        for(int i = 0; i < r2; i++)
        {
            for(int j = 0; j < c2; j++)
            {
                array2[i][j] = sc.nextInt();
            }
        }
        add(array1, r1, c1, array2, r2, c2);
        sc.close();
    }
}