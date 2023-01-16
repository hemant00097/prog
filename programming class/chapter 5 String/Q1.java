
import java.util.Scanner;
public class Q1
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String ");
        String st=sc.nextLine();
        sc.close();

        int uc=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch>='A'&&ch<='Z')
            uc++;
        }
        System.out.println("Number is Capitel leter "+uc);
    }
}