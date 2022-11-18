//Write a java program to count how many letter and digit are present in the string
//i/p =    ba6n5gal7o4r2e9
// o/p =   letter are 9
//         digits are 6
import java.util.Scanner;
public class Q20 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String ");
        String st=sc.nextLine();
        sc.close();
        int letter=0,digit=0;
        for(int i=0;i<st.length();i++)
        {
            char ch= st.charAt(i);

            if(ch>='a'&&ch<='z')
            letter++;
            else if(ch>='0'&&ch<='9')
            digit++;
        }
        System.out.println("letter are "+letter);
        System.out.println("digits are "+digit);
    }
    
}
