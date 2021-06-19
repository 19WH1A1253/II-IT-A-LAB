class NestedTryCatch
{  
 public static void main(String args[])
 {  
  try
  {  
    try
    {  
     System.out.println("going to divide");  
     int b =1/0;  
    }
    catch(ArithmeticException e)
    {
     System.out.println(e);
    }  
    try
    {
    System.out.println("exception when dealing with array");
    int a[]=new int[10];  
    a[10]=4;  
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println(e);
    }     
  }
  catch(Exception e)
  {
    System.out.println("Exception handled");
  }  
  System.out.println("-----Rest Code------");  
 }  
}