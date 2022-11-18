// Write a java program to convert all lowercase characters to uppercase character.
//i/p= rama is a good boy
//o/p= RAMA IS A GOOD BOY
import java.util.Scanner;

public class Q33 
{
    static String toUpper(String str)
    {
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]>='a' && ch[i]<='z')
            {
                ch[i]=(char)(ch[i]-32);
            }
        }
        str =new String(ch);
        return str;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String ");
        String st=sc.nextLine();
        System.out.println(toUpper(st));
        sc.close();
    }
    
}
