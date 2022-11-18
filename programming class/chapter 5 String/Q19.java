//Write a java program to count hoe many samll vowels ,small consonents and special chaeacter are persent in the String
// i/p = baNg!A#IUru@% 
//o/p =  Small vowels are 2
//       Small Consonent are 3
//       Special character are 4
import java.util.Scanner;
public class Q19 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner( System.in);
        System.out.println("Enter the String ");
        String st=sc.nextLine();
        sc.close();
        int sml=0,sl=0,spl=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch>='a'&&ch<='z')
            {
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                sml++;
                else 
                sl++;
            }
            else if(!(ch>='0'&&ch<='9')&&!(ch>='A'&&ch<='Z'))
            {
            spl++;
            }
        }

        System.out.println("Small vowels are "+sml);
        System.out.println("Small Consonent are "+sl);
        System.out.println("Special character are "+spl);
    }
    
}
