// write a java program to reverse the string 
// i/p =chitradurga
// o/p =agrudartihc
import java.util.Scanner;

public class ReverseString {
    static String reverse(String str)
    {
        char ch[]=str.toCharArray();
        int i=0,j=ch.length-1;
        while(i<j)
        {
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        str=new String(ch);
        return str;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String ");
        String st=sc.next();
        st=reverse(st);
        System.out.println(st);
        sc.close();
    }
}
