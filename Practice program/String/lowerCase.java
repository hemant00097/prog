//  WAP to convert all the charecter in the givin string to lowercase without inbilt  method predefined method  
import java.util.Scanner;

public class lowerCase 
{
    public static void main(String[] args) 
    {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the String ");
       String st=sc.next();
       char ch[]=st.toCharArray();
       for(int i=0;i<ch.length;i++)
       {
        System.out.println(i+" --> "+ch[i]);
       }        
    }
}
