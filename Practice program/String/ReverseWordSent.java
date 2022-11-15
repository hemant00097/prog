// write a java program to reverse the words in the Sentence
// i/p =  rama is a good boy 
// o/p =  amra si a doog yob
import java.util.Scanner;

public class ReverseWordSent {
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        System.out.println("Enter the String ");
        String st=sc.nextLine();
        sc.close();
        char ch[]=st.toCharArray();
        String rs=" ";
        for(int i=0;i<ch.length ;i++)
        {
            int k=i;
            while(i<ch.length && ch[i]!=' ')
            {
                i++;
            }
            int j=i-1;
            while(j>=k)
            {
                rs=rs+ch[j];
                j--;
            }
            if(i<ch.length)
            rs=rs+ch[i];
        }
        System.out.println(rs);
    }
}
