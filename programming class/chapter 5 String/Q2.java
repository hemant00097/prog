// Write a java program to count how mant capital letters and small letter persent in the String
// i/p = BanGaLore
// o/p =capital letter ->3
//       Small Letter ->6
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String st=sc.nextLine();
        sc.close();
        int uc=0,lc=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch>='A'&&ch<='Z')
            uc++;
           else if(ch>='a'&&ch<='z')
            lc++;
        }
        System.out.println("capital letter ->" +uc);
        System.out.println("Small letter are ->"+lc);
    }
}

