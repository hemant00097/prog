// WAP To Define to print how many capitel latter and small latter digit and special charecter presnt in the String
import java.util.Scanner;

public class CapAndSmallLatCount {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String st=sc.nextLine();
        int uc=0,lc=0,dc=0,spc=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch>='A' && ch<='Z')
            uc++;
            if(ch>='a' && ch<='z')
            lc++;
            if(ch>='0' && ch<='9')
            dc++;
            else
            spc++;
        }
        System.out.println("Number the Capitel Letter "+uc);
        System.out.println("Number the Small Letter "+lc);

        System.out.println("Number of the Digit "+dc);

        System.out.println("Number the Special Charat "+spc);


    }
}
