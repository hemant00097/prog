// Write a java porogram to count hoe many small letter present in the string
// i/p=DhAeWaDa
// o/p= 4
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String st=sc.nextLine();
        sc.close();
        int sl=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch>='a'&&ch<='z')
            sl++;

        }
        System.out.println("Small letter "+sl);
    }
}
