// Write A java program to define a method two String convert  the Assinging order
import java.util.Arrays;
import java.util.Scanner;
public class ConvertAssingingOrder {
    public static void main(String[] args) 
    {
        Scanner sc=  new Scanner( System.in);
        System.out.println("enter the string ");

        String str=sc.nextLine();
        sc.close();
        str=str.toLowerCase();
        char ch[]=str.toCharArray();
        Arrays.sort(ch);
        str=new String(ch);
        System.out.println(str);
    }
}
