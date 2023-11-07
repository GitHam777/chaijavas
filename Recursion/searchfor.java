class searchfor
{
  static boolean search(int[] a, int n, int target, int id) 
  {
    if (id >= n) 
    {
      return false;
    }
    if (a[id] == target) 
    {
      return true;
    }
    if (search(a, n, target, id + 1)) 
    {
      return true;
    } 
    else 
    {
      return false;
    }
  }
public static void main(String[] args) 
  {
    int a[] = {1, 2, 4, 6};
    int target = 4;
    if (search(a, a.length, target, 0) == true) 
    {
      System.out.println("Yes");
    } 
    else 
    {
      System.out.println("No");
    }
  }
}