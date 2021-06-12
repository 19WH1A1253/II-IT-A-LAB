public class TryCatch
{  
  
    public static void main(String[] args) 
   {  
        try  
        {  
        int data=1/0; //may throw exception   
        }   
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("------Rest code------");  
    }  
      
}