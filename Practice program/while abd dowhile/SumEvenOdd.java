import java.util.Scanner;

public class SumEvenOdd {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    sc.close();
    int even=0;
    int odd=0;
    while(n!=0)
    {
        int r=n%10;
        if(r%2==0)
        {
            even=even+r;

        }
        if(r%2!=0)
        {
            odd=odd+r;
        }
        n=n/10;
    }
    if(even==odd)
    {
        System.out.println("pass");
    }
    else
    {
        System.out.println("fail");
    }
}
}
