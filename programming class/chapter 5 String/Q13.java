//Wrint a java program to count how many small letters and special characters are present in the String
//i/p = Shi@/vaMo!gG%A
//     small letter are =6
//     spacial character are =4
import java.util.Scanner;
public class Q13 
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String st=sc.nextLine();
        sc.close();
        int sml=0,spl=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch>='a'&&ch<='z')
            sml++;

            else if(!(ch>='0'&&ch<='9')&&!(ch>='A'&&ch<='Z'))
            spl++;
        }
        System.out.println(" small letter are "+sml);
        System.out.println("Special character are "+spl);
    }
}
