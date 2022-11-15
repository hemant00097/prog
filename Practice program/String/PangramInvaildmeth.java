// Write a java program to String is a pangram or not using Invaild method
// i/p = The quick brown fox jumps over the lazy dog.
// o/p string is pangram
import java.util.Scanner;

public class PangramInvaildmeth 
{
   public static void main(String[] args) 
   { 
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the String ");
    String st=sc.nextLine();
    sc.close();
    boolean rs=isPanagram(st);
   
    if(rs==true)
    
        System.out.println("String is pangram");
    
    else 
    
        System.out.println("String is not a pangram");
   }
    static boolean isPanagram(String st)
    {
        if(st.length()<26)
        return false;
        
        st=st.toLowerCase();
        for(char ch='a';ch<='z';ch++)
        {
            if(st.indexOf(ch)==-1)
            return false;
        }
        return true;

    } 
   }    

