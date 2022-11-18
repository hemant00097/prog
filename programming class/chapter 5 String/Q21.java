// Write a java program to count how many special character and digit are digit are present in the String
//i/p=   @123#9%3!
//o/p=   Special character are 4
//       Digits are 5
import java.util.Scanner;
public class Q21 
{
    public static void main(String[] args) 
    {
        Scanner  sc=new Scanner( System.in);
        System.out.println("Enter the String ");
        String st=sc.nextLine();
        sc.close();
        int scl=0,digit=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(!(ch>='0'&&ch<='9'))
            scl++;
            else if(ch>='0'&&ch<='9')
            digit++;
        }
        System.out.println("Special character are "+scl);
        System.out.println("Digits are "+digit);
        
    }
    
}
