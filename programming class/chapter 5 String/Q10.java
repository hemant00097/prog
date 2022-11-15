//Wrint a java program to count how many small vowels and capitall consonents are present in the String
//i/p = ShiVaMOGgA
//     small vowels are =2
//     capital consonents are =4
import java.util.Scanner;
public class Q10
{
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the String ");
       String st=sc.nextLine();
       sc.close();
       int svl=0,ccl=0;
       for(int i=0;i<st.length();i++)
       {
        char ch=st.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        svl++;
        else if(ch>='A'&&ch<='Z')
        {
            if(ch!='A'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U')
            ccl++;
        }
       }   
       System.out.println("small vowels are = "+svl);
       System.out.println("Capital consonents are = "+ccl);     
    }
    
}

