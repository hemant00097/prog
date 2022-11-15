//Wrint a java program to count how many small vowels and small consonents are present in the String
//i/p =DavAnAgerE
//     small vowels are =2
//     small consonents are =4
import java.util.Scanner;
public class Q9
{
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the String ");
       String st=sc.nextLine();
       sc.close();
       int svl=0,scl=0;
       for(int i=0;i<st.length();i++)
       {
        char ch=st.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        svl++;
        else if(ch>='a'&&ch<='z')
        scl++;
       }   
       System.out.println("small vowels are = "+svl);
       System.out.println("small consonents are = "+scl);     
    }
    
}

