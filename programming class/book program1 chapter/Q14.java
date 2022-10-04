import java.util.Scanner ;

public class Q14 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Amount ");
    int amount=sc.nextInt();
    System.out.println("Enter Interest of rate");
    int Interest=sc.nextInt();
    System.out.println("Enter the Time ");
    int Time=sc.nextInt();
    sc.close();
    double SI=amount*Interest*Time/100;
    System.out.println(SI);
  }  
}
