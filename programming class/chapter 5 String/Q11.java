//Wrint a java program to count how many capital vowels and small consonents are present in the String
//i/p = HArIhaRa
//     capital vowels are =2
//     small consonents are =2
import java.util.Scanner;
public class Q11

{
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the String ");
       String st=sc.nextLine();
       sc.close();
       int cvl=0,scl=0;
       for(int i=0;i<st.length();i++)
       {
        char ch=st.charAt(i);
        if(ch>='A'&&ch<='Z')
        {
           if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            cvl++;
        }
        else if(ch>='a'&&ch<='z')
        {
            if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u')
            scl++;
        }
       }   
       System.out.println("small vowels are = "+cvl);
       System.out.println("Capital consonents are = "+scl);     
    }
}

