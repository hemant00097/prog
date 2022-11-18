//Wrint a java program to count how many capital vowels,capital consenents  and special characters are present in the String
//i/p = sha$HA#pUrA@%
//o/p= capital letter vowels are=3
//     small consenents are =4
//     spacial character are =4
import java.util.Scanner;
public class Q16 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String st=sc.nextLine();
        sc.close();
        int cplv=0,sml=0,spl=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch>='A'&&ch<='Z')
            {
              if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
              cplv++;
            }
            else if(ch>='a'&&ch<='z')
            {
               if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u')
               sml++;
            }
           
            else if(!(ch>=0&&ch<=9))
            spl++;
        }
        System.out.println("Capital vowels are = "+cplv);
        System.out.println("Small consonents are = "+sml);
        System.out.println("Special character are = "+spl);
    }
    
}
