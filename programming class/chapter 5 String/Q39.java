// write a java program to  return how many words present in the sentence 
// i/p = chitradurga ia a fort city 
// o/p = 5
import java.util.Scanner;
public class Q39 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String ");
        String st=sc.nextLine();
        sc.close();
        int wc=countWords(st);
        System.out.println("Number of words : "+wc);
     }
      static int countWords(String st)
        {
           char ch[]=st.toCharArray();
           int count=0;
           for(int i=0;i<ch.length;i++)
           {
             if(i==0 && ch[i]!=' ' || ch[i]!=' '&& ch[i-1]==' ')
                {
                   count ++;
                }
           }
         return count;
       }        
    }
