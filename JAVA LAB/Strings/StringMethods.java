import java.util.*;
class StringMethods{
public static void main(String args[])
{ 
   String word;
   Scanner s = new Scanner(System.in);
   System.out.print("Enter a string :");
   word = s.next();
   System.out.println("-----1.concat()-----");
   System.out.println(word.concat(" are yum!"));
   System.out.println("-----2.length()-----");
   System.out.println(word.length());
   System.out.println("-----3.charAt()-----");
   System.out.println(word.charAt(7));
   System.out.println("-----4.strCmp()-----");
   System.out.println(word.compareTo("chocolatE"));
   System.out.println("-----5.equals()-----");
   System.out.println(word.equals("chocolateS"));
   System.out.println("-----6.startsWith()-----");
   System.out.println(word.startsWith("choco"));
   System.out.println("-----7.endsWith()-----");
   System.out.println(word.endsWith("late"));
   System.out.println("-----8.indexOf()-----");
   System.out.println(word.indexOf("la"));
   System.out.println("-----9.lastIndexOf()-----");
   System.out.println(word.lastIndexOf("c"));
   System.out.println("-----10.substring()-----");
   System.out.println(word.substring(5));
   System.out.println("------11.toLowerCase()-----");
   System.out.println(word.toLowerCase());
   System.out.println("-----12.toUpperCase()-----");
   System.out.println(word.toUpperCase());
   System.out.println("------13.trim()------");
   System.out.println(word.trim()); // removes white space in string
   System.out.println("-----14.split()-----");
   String a[] = word.split("");
   for(int i=0;i<a.length;i++)
   {
     System.out.print(a[i] +',');
   }
   System.out.print("\n");
   System.out.println("-----15.replace()-----");
   System.out.println(word.replace("chocolateS", "chocolate"));
   System.out.println("-----16.IgnoreCase()-----");
   System.out.println(("chocolates").equalsIgnoreCase(word));
   
} 
} 
  