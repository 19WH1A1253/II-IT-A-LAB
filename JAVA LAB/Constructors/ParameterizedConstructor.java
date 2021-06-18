class Base
{
   Base(int x)
   {
      int a = x;
     System.out.println("value of a is "+a);
   }
   Base()
{
     System.out.println("Base Class");
}
}
class Child extends Base
{
    Child()
    {
        super(100);
        System.out.println("Child class");   
}
   
}
class ParameterizedConstructor
{
    public static void main(String[] args)
    {
       Child obj = new Child();
    }
}