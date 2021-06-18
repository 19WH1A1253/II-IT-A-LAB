class Animal
{
   void display1()
{ System.out.println("This is animal class");
}
}
class Dog extends Animal 
{
void display2()
{ System.out.println("Dog is an animal.");
}
}
class Puppy extends Dog
{
void display3()
{ 
System.out.println("Puppy is juvenile of dog.");
}
}
class MultilevelInheritance
{
public static void main(String[] args)
{
Puppy obj = new Puppy();
obj.display3();
}
}

