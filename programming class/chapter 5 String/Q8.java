//Wrint a java program to count how many capital vowels and capital consonents are present in the String
//i/p =cHiTrAdURGa
//     vowels are =3
//     consonents are =8
import java.util.Scanner;

public class Q8
{
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the String ");
       String st=sc.nextLine();
       sc.close();
       int cvl=0,cl=0;
       for(int i=0;i<st.length();i++)
       {
        char ch=st.charAt(i);
        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        cvl++;
        else if(ch>='A'&&ch<='Z')
        cl++;
       }   
       System.out.println("capital vowels are = "+cvl);
       System.out.println("Capital consonents are = "+cl);     
    }
    
}
