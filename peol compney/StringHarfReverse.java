import java.util.Scanner;

public class StringHarfReverse {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str =sc.nextLine();
        char ch[] = new char[str.length()];
        int rev=str.length()/2;
        sc.close();
        for(int i=0;i<str.length()/2+1;i++){
           ch[i]=str.charAt(rev);
            rev--;
        }
        for(int i=str.length()/2+1;i<str.length();i++){
            ch[i]=str.charAt(i);

        }
   for(int i=0;i<ch.length;i++)
   {
    System.out.print(ch[i]);
   }
}
}
