package src;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online
import java.util.*;
public class LPS
{
 public static boolean palindrome (String s)
 {
     for(int i=0;i<((int)s.length()/2);i++)
     {
         if(s.charAt(i)!=s.charAt(s.length()-i-1))
         {
             return false;
         }
     }
     return true;
 }
 public static void main(String[] args) 
 {
     Scanner sc=new Scanner (System.in);
     System.out.println("ENTER INPUT :");
     String s=sc.next();
     int n=s.length();
     
     List<String> pal=new ArrayList <>();
     for(int i=0;i<n;i++)
     {
         for(int j=i+1;j<=n;j++)
         {
             String sub=s.substring(i,j);
             if(palindrome(sub))
             {
                 pal.add(sub);
             }
         }
     }
     
     int len=0;
     String ans="";
     for(String str:pal)
     {
         if(len<=str.length())
         {
             len=str.length();
             ans=str;
         }
     }
     System.out.println (pal);
     System.out.println (ans);
 }
}
