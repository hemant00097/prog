//Wreite a java program to canvert every word first character into small reamaining capital. 
//i/p=   rama is a bad boy
//o/p=  convert: rAMA iS a bAD bOY
import java.util.Scanner;
public class Q29 {
    public static String firstSmall(String str)
    {
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(i==0&&ch[i]!=' '||ch[i]!=' '&& ch[i-1]==' ')
            {
                if(ch[i]>='A'&&ch[i]<='Z')
                {
                    ch[i]=(char)(ch[i]+32);
                }
            }
            else if(ch[i]>='a'&&ch[i]<='z')
            {
                ch[i]=(char)(ch[i]-32);
            }   
            }
            str=new String(ch);
            return str;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String st=sc.nextLine();
        System.out.println("convert: "+firstSmall(st));
        sc.close();
    }
}

