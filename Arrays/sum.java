public class sum
{
  public static void main(String[] args) 
  {
    int[] array = {1,2,4,7,3};
    int sum = 0;
    for(int i = 0; i < array.length; i++)
    {
      sum = sum + array[i];
    }
    System.out.println("Sum of Array elements: "+sum);
  }
} 
