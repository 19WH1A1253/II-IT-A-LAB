class Base
{
  int a = 12;
}
class Child extends Base
{
   int b = 16;
   void sum()
{
   System.out.println("sum:"+(a+b));
}
}
class Child2 extends Base
{
   int c = 89;
   
}
class Child3 extends Child2
{
   
void mul()
{
   int c = 33;
   System.out.println("Mul:"+(a*c));
}
    
}

class HybridInheritance
{
    public static void main(String[] args)
{
    Child obj = new Child();
    Child3 obj2 = new Child3();
    obj.sum();
    obj2.mul();
}
}