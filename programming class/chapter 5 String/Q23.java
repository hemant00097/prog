// Write a java program to count how many small  letter ,special character and digit are present in the String 
// i/p= g2a^jeb5d%ra8g#ad6a@
// o/p=  Small letter are 12
//       Special characters are 4
//       Digit are 4
import java.util.Scanner;

public class Q23 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String ");
        String st=sc.nextLine();
        sc.close();
        int sml=0,scl=0,diggit=0;
        for(int i=0;i<st.length();i++)
         {
            char ch=st.charAt(i);
            if(ch>='a'&&ch<='z')
            sml++;
            else if(!(ch>='0'&&ch<='9')&&!(ch>='A'&&ch<='Z'))
            scl++;
            else if(ch>='0'&&ch<='9')
            diggit++;
         }
         System.out.println("Small letter are "+sml);
         System.out.println("Special characters are "+scl);
         System.out.println("Digit are "+diggit);
        
    }
    
}
