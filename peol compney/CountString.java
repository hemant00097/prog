import java.util.Scanner;

public class CountString {
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        sc.close();
        int uc=0;
        for(int i=0;i<str.length();i++)
        {
          char ch=str.charAt(i);
          if(ch>'A'&&ch<'Z')
          uc++;
        }
        System.out.println(uc);   
    }
}
