class Base{
   void method()
   {  System.out.println("base class");
   }
}
class Child extends Base
{
   void method()
   {
    System.out.println("child class");
    
   }
   void display()
   {
     method();
     super.method();
}
   
}
class Overriding
{
   public static void main(String[] args)
   {
     Child obj = new Child();
     obj.display();
}
}
      
