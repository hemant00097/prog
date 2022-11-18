//  Write a java program to convert all upperscase characters to lowerercase characters.
//I/P= CHITRADURGA IS A FORT CITY
//O/P= chitradurga is a fort city
import java.util.Scanner;
public class Q34 
{
    public static String toLower(String str)
    {
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]>='A' &&ch[i]<='Z')
            {
                ch[i]=(char)(ch[i]+32);
            }
        }
        str=new String(ch);
        return str;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String st=sc.nextLine();
        System.out.println(toLower(st));
        sc.close();
    }
}
