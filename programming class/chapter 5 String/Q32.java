// Write  a java program to define a method to caliculat the sum of digit present in tne String
// i/p = gadag@12345
// o/p = 15

import java.util.Scanner;

public class Q32 
{
    static int sumDigit(String st)
    {
        int sum=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch>='0' && ch<='9')
            sum=sum+ch-48;
        }
        return sum;
    }
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String ");
        String st=sc.next();
        sc.close();
        int sm=sumDigit(st);
        System.out.println("Sum of digit: "+sm);

    }
}
