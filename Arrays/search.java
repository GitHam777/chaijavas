public class search
{
  public static void main(String[] args) 
  {
    int[] array = {1,2,4,7,3};
    int x = 2, p = -1;
    for(int i = 0; i < array.length; i++)
    {
      if(array[i] == x)
      {
        p = i;
        break;
      }
    }
    if(p == -1)
    {
      System.out.println("Element not present");
    }
    else
    {
      System.out.println("Element present in " + (p + 1) + "th position of Array");
    }
  }
}