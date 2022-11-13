import java.util.Scanner;
public class Palindrome 
{
    static boolean ispalindrom(String st)
    {
        int i=0,j=st.length()-1;
        while(i<j)
        {
            if(st.charAt(i)!=st.charAt(i))
            return false;
            i++;
            j--;
        }
        return true;
    }
   public static void main(String[] args) 
   {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the String ");
    String st=sc.next();
    sc.close();
    boolean rs =ispalindrom(st);
    if(rs==true)
    System.out.print(st+" is Plindrome");
    else 
    System.out.print(st+"is a not palindrom");
    
   }
}