//Wrint a java program to count how many small vowels,small consenents  and special characters are present in the String
//i/p = baNg!A#lUru@%
//o/p= Small letter vowels are=2
//     capital consenents are =3
//     spacial character are =4
import java.util.Scanner;
public class Q17 
{
    public static void main(String[] args) 
    {
         Scanner sc = new Scanner( System.in);
         System.out.println("Enter the String ");
         String st=sc.nextLine();
         sc.close();
         int slv=0,scl=0,spc=0;
         for(int i=0; i<st.length();i++)
         {
            char ch=st.charAt(i);
            if(ch>='a'&&ch<='z')
            {
            if(ch=='a'||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
            slv++;
            }
            else if(ch>='A'&&ch<='Z')
            {
              if(ch!='A'||ch!='E'||ch!='I'||ch!='O'||ch!='u')
              scl++;
            }
            else if(!(ch>=0&&ch<=9))
            spc++;
         }
         System.out.println("Small vowels sre"+slv);
         System.out.println("Small consonent are "+scl);
         System.out.println("Special character are "+spc);
    }
    
}
