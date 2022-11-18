//Wrint a java program to count how many capital letters and special characters are present in the String
//i/p = Shi@/vaMo!gG%A
//     capital letter are =5
//     spacial character are =4
import java.util.Scanner;
public class Q14 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String st=sc.nextLine();
        sc.close();
        int cpl=0,spl=0;
        for(int i=0;i<st.length();i++)
        {
           char ch=st.charAt(i);
           if(ch>='A'&&ch<='Z')
           cpl++;
           else if(!(ch>='0'&&ch<='9')&&!(ch>='a'&&ch<='z'))
           spl++;
        }
        System.out.println("Capitel letter "+cpl);
        System.out.println("Special character are "+spl);
    }
    
}
