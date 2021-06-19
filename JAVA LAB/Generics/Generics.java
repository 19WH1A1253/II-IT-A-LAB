class Generics
{
      static <T> void display(T element)
      {
           System.out.println(element.getClass().getName() + " = " + element);
      }
      public static void main(String[ ] args)
      {
          display(100);
          display("Welcome To Generic Functions");
          display(5.0);
      }
} 