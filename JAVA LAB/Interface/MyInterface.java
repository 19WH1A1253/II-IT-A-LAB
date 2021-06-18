interface Int
{
void display1();
void display2();
}
class MyClass implements Int
{
 public void display1()
{
System.out.println("hello,from display1()");
}
public void display2()
{
System.out.println("hello,from display2()");
}
}
class MyInterface
{
  public static void main(String args[])
{
MyClass obj = new MyClass();
obj.display1();
obj.display2();
}
}