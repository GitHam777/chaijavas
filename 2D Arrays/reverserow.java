import java.util.Scanner;

public class reverserow 
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

    static void swap(int[] array, int i, int j) 
    {
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    static void reverse(int[] array) 
    {
        int i = 0, j = array.length - 1;
        while (i < j) 
        {
            swap(array, i, j);
            i++;
            j--;
        }
    }

    static void reverseRows(int[][] array)
    {
        System.out.println("Original Array");
        printarray(array);
        for(int i = 0; i < array.length; i++)
        {
            reverse(array[i]);
        }
        System.out.println("New Array:");
        printarray(array);
    }
        
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int r = sc.nextInt();
        System.out.print("Enter Colums: ");
        int c = sc.nextInt();
        int[][] array = new int[r][c];
        System.out.println("Enter elements of 2D Array: ");
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                array[i][j] = sc.nextInt();
            }
        }
        reverseRows(array);
        sc.close();
    }
}

