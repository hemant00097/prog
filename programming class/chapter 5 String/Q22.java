// Write a java program to count how many capital letter ,special character and digit are present in the String 
//i/p=   B3A@N6G$A7LO%R9E
//o/p=   Capital letter are 9
//       Special character are 3
//       Digit are 4
import java.util.Scanner;
public class Q22 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String ");
        String st=sc.nextLine();
        sc.close();
        int cl=0,scl=0,digit=0;

        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch>='A'&&ch<='Z')
            cl++;
            else if(!(ch>='0'&&ch<='9')&&!(ch>='a'&&ch<='z'))
            scl++;
            else if(ch>='0'&&ch<='9')
            digit++;
        }
        System.out.println("Capital letter are "+cl);
        System.out.println("Special character are "+scl);
        System.out.println("Digit are "+digit);
    }
}
