// Wreite a java program to count how many capital vowels and small vowels are present  in the String.
// i/p =chikkAmangIUru
// o/p = capital vowels are ->2
//     Small vowels are ->3
import java.util.Scanner;
public class Q6 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String ");
        String st=sc.nextLine();
        sc.close();
        int sml=0,cpl=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            cpl++;

            else if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            sml++;
        }
        System.out.println("Capital vowels Are "+cpl);
        System.out.println(" Small vowels Are "+sml);

    }
    
}
