//Wrint a java program to count how many capital letter,small letters and special characters are present in the String
//i/p = Bag@LAk+oT%e
//o/p= capital letter are=4 
//     small letter are =5
//     spacial character are =3
import java.util.Scanner;
public class Q15 
{
    public static void main(String[] args) 
    { 
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String ");
        String st = sc.nextLine();
        sc.close();
        int cpl=0,sml=0,scl=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch>='A'&&ch<='Z')
            cpl++;
            else if(ch>='a'&&ch<='z')
            sml++;
            else if(!(ch>='0'&&ch<='9'))
            scl++;

        }
        System.out.println("Capital letter are "+cpl);
        System.out.println("small letter are "+sml);
        System.out.println("Special character are "+scl);
    }
    
}
