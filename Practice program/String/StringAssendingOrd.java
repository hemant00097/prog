// write a java program to definr a method to print the String assending order in Sentence.
// i/p = i am going to Scahool
// o/p = am  going i school to
     
import java.util.Arrays;
import java.util.Scanner;
public class StringAssendingOrd 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String ");
        String st=sc.nextLine();
        sc.close();
        String str[]=st.split(" ");
        Arrays.sort(str);
        st=" ";
        for(int i=0;i<str.length;i++)
        {
            st=st+str[i];

            if(i<str.length-1)
            st=st+" ";
        }
        System.out.println(st);
    }
}
