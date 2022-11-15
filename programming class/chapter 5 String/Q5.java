// Wreite a java program to count how many small vowels present  in the String.
// i/p =havEri
// o/p =2
import java.util.Scanner;
public class Q5 
{
    public static void main(String[] args) 
    {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the String ");
    String st=sc.nextLine();
    sc.close();
    int sl=0;
    for(int i=0;i<st.length();i++)
    {
        char ch=st.charAt(i);
        if(ch=='a'||ch=='e'|| ch=='i'||ch=='o'||ch=='u')
        sl++;
    }   
    System.out.println(sl);     
    }
    
}
