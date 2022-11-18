// Write a java program toconvert every word last character into small remaining capital.
//i/p=  rama is a good boy
//o/p=  ramA iS A gooD boY

import java.util.Scanner;
public class Q31
{
    public static String lastToSmall(String str)
    {
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(i==ch.length-1&&ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ')
            {
                if(ch[i]>='a'&&ch[i]<='z')
                {
                    ch[i]=(char)(ch[i]-32);
                }
            }
            else if(ch[i]>='A'&&ch[i]<='Z')
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
        System.out.println(lastToSmall(st));
        sc.close();
    }
}

