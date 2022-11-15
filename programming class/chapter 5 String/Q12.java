//Wrint a java program to count how many letters and special characters are present in the String
//i/p = shiv>va<#mo$gga@
//     letter are =11
//     spacial character are =5
import java.util.Scanner;
public class Q12 
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String st=sc.nextLine();
        sc.close();
        int ml=0,spl=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z')
            ml++;

            else if(!(ch>='0'&&ch<='9'))
            spl++;
        }
        System.out.println("letter are "+ml);
        System.out.println("Special character are "+spl);
    }
}
