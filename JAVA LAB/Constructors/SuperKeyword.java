class Base
{
   int num = 10;
}
class Child extends Base
{
   int num = 20;
   void display()
   {
      System.out.println("child variable :"+num);
      System.out.println("Base variable :"+super.num);
   }
}
class SuperKeyword
{
   public static void main(String[] args)
   { 
      Child obj = new Child();
      obj.display();
}
}