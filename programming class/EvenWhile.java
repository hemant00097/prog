import java.util.Scanner;
public class EvenWhile  {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the nubmer");
        int n=sc.nextInt();
       // int i=1;
        int i=2;
        sc.close();
        while(i<=n)
        {
       //  if(i%2==0)    //i=1
       //    System.out.println(i);   //even number
       //    i++;
           System.out.println(i);   // int i=1 and this is a odd number same formula
           i=i+2;
        }

    }
}
