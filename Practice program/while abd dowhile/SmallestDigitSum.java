 import java.util.Scanner;

public class SmallestDigitSum {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    sc.close();
    int small=9;
    int big=-9;
    while(n!=0)
    {
        int r=n%10;
        if(small>r)
        {
            small=r;

        }
        if(r>big)
        {
            big=r;
        }
        n=n/10;
    }
    
        System.out.println(big+small);
    }
}
