// write a java program to count how mant capitel vowels present in the string 
// i/p =prOgrammIng
// o/p =2
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String ");
        String st=sc.nextLine();
        sc.close();
        int cl=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch=='A'||ch== 'E'||ch=='I'||ch=='O'||ch=='U')
            cl++;
        }
        System.out.println(cl);
        
    }
}
