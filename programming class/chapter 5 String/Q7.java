//Wrint a java program to count how many vowels and consonents are present in the String
//i/p = programming
//      vowels are =3
//      consonents are =8
import java.util.Scanner;
public class Q7 
{
  public static void main(String[] args) 
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the String ");
    String st=sc.nextLine();
    sc.close();
    int vl=0,cl=0;
    for(int i=0;i<st.length();i++)
    {
        char ch=st.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        vl++;
        else if(ch>='a'&&ch<='z')
        cl++;
    }
    System.out.println("vowels are = "+vl);
    System.out.println("consonents are = "+cl);
  }    
}
