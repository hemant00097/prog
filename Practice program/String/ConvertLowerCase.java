// Write A java program to convert all the character into lowercase
// i/p = BAnGLoRE
// o/p = banglore
import java.util.Scanner;
public class ConvertLowerCase {
    static String toLower(String str)
    {
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]>='A' && ch[i]<='Z')
            ch[i]=(char)(ch[i]+32);
            
        }
        str=new String(ch);  //char array to String 
        return str;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String ");
        String st=sc.next();
        sc.close();
        st=toLower(st);
        System.out.println(st);
    }
}
