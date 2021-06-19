import java.lang.*;
public class AutoUnboxingDemo
{
      public static void main(String[ ] args)
     {
              Integer num = 10;
              int i = num;
              int j = num.intValue();
              System.out.println("num = " + num + ", i = " +  i + ", j =  " + j);
}
}  