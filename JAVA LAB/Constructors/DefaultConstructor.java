class Base
{
   Base()
   {
     System.out.println("base constructor");
   }
}
class Child extends Base
{
   Child()
   {
     System.out.println("child constructor");
   }
}
class DefaultConstructor
{
   public static void main(String[] args)
   {
     Child obj = new Child();
}
}
    