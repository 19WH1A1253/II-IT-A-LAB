public class MultipleCatch
{  
  
    public static void main(String[] args)
    {  
          
           try
	   {    
                int a[]=new int[10];    
                a[10]=1/0;    
           }    
           catch(ArithmeticException e)  
           {  
                System.out.println("Arithmetic Exception");  
           }    
           catch(ArrayIndexOutOfBoundsException e)  
           {  
              System.out.println("ArrayIndexOutOfBounds Exception");  
           }    
           catch(Exception e)  
           {  
                 System.out.println("Parent Exception");  
           }             
           System.out.println("-------Rest code------");    
    }  
}  
