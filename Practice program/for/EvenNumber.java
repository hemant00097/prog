import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        sc.close();
        for(int i=0;i<=n;i++)
        {
          if(i%2==0)
            System.out.print(i +" ");

        }
    }
}
