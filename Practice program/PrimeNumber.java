import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();sc.close();
        int big =0;
        while(n!=0)
        {
            int r=n%10;
            if(r==1 || r==2 || r==3 || r==5 || r==7 )
            {
                big++;
            }
            n=n/10;
        }
        System.out.println(big);
    }
}
