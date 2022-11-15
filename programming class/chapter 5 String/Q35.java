// Write a java program to frequency of each character given in the string 
// i/p = hubballi
// o/p -> h ->1
//        u ->1
//        b ->2
//        a ->1
//        l ->2
//        i ->1
import java.util.Scanner;

public class Q35
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String ");
        String st=sc.nextLine();
        sc.close();
        int count[]=new int[128];
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            count[ch]++;
        }
        for(int i=0; i<count.length;i++)
        {
            if(count[i]!=0)
            System.out.println((char)i +" --> "+count[i]);
        }
    }
}