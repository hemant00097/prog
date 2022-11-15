//Write a java program tp convert  all the character into upercase
//i/p = ShiVaMoGGA
// o/p =SHIVAMOGGA
import java.util.Scanner;

public class CovtoUperCase {
    static String toUpercase(String str)
    {
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]>='a' && ch[i]<='z')
            ch[i]=(char)(ch[i]-32);
        }
        str=new String(ch);
        return str;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String ");
        String st=sc.next();
        st=toUpercase(st);
        System.out.println(st);
        sc.close();
    }
}
