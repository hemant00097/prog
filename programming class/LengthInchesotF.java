import java.util.Scanner ;
public class LengthInchesotF {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number ");
    double inches = sc.nextDouble();
    sc.close();
    double feet =inches/12;
    double Meter =inches/39.37;
    System.out.println("inches  to Feets : "+feet); 
    System.out.println("inches  to Meter : "+ Meter);
   } 
}
