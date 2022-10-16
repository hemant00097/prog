
import java.util.Scanner;
public class Q34 {
    static String checkxp(int n)
    {
        int os=0,ms=0,t=n;
        while(n!=0)
        {
            int r=n%10;
         if(t==n || r==n)
            os=os+r;
         else
            ms=ms+r;
            n=n/10;
        }
        if(ms==os)
        return "Xylem";
        else
        return "phloem";
    }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number");
    int n=sc.nextInt();
    //checkxp(n);
    sc.close();
    System.out.print(checkxp(n));
  }

}

