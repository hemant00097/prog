import java.util.Scanner ;
public class RateOfInterest {
   public static void main(String[] args) 
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Amount ");
    double p=sc.nextDouble();
    System.out.println("Enter the rate of interst ");
    double r=sc.nextDouble();
    System.out.println("Enter the time ");
    int  t = sc.nextInt();
    sc.close();
    double ROI=p*r*t/100;
    System.out.println("simple Rate  OfInterest " +ROI);

   } 
}
