class Student
{
  int roll;
  String name;
}

class basic2
{
  public static void main(String[] args)
  {
    Student obj = new Student();
    obj.roll = 15;
    obj.name = "Sameer Fuddi";
    System.out.println( obj.roll );
    System.out.println( obj.name );

    Student obj2 = new Student();
    obj2.roll = 25;
    obj2.name = "Banchordas";
    System.out.println( obj2.roll );
    System.out.println( obj2.name );
  }
}