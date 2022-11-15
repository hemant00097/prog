import java.util.Arrays;
import java.util.Scanner;

public class AnagramOrNot 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first String");
        String st1=sc.nextLine();
        System.out.println("Enter thye second String");
        String st2=sc.nextLine();
        sc.close();
        boolean rs=isAnagram(st1,st2);
        if(rs)
        System.out.println("String are Anagram");
        else
        System.out.println("String are not Anagram"); 
    }
    static boolean isAnagram(String st1,String st2)
    {
        st1=st1.replace(" ", "");
        st2=st2.replace(" ", "");
        
        if(st1.length()!=st2.length())
        return false;

        st1=st1.toUpperCase();
        st2=st2.toUpperCase();

        char c1[]=st1.toCharArray();
        char c2[]=st2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);

    }
    
}
