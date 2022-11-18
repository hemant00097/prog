// Write a java program to count how many capitel voewles .capital consonent and specia; character are present in the String
// i/p = BEnG^AL*URu&#@ 
// o/p = Capital voewls are 3
//       Capital consonent are 4
//       Special character are 5
import java.util.Scanner;
public class Q18 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String ");
        String st=sc.nextLine();
        sc.close();

        int cvl=0,ccl=0,spl=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch>='A'&&ch<='Z')
             {
                if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                cvl++;
                else 
                ccl++;
             }
             else if(!(ch>=0&&ch<=9)&&!(ch>='a'&&ch<='z'))
             spl++;

        }
        System.out.println("Capital voewls are "+cvl);
        System.out.println("Capital consonent are "+ccl);
        System.out.println("Special character are "+spl);
        
    }
    
}
