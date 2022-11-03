// Write A Java Program LeapYear Between 2000 To 2500 
import java.util.Scanner;
public class leapyearOrNot
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the year");
        int year=sc.nextInt();
       sc.close();
      if((year%4==0 && year%100!=0) || year%400==0)  
      System.out.println("leap year");
      else 
      System.out.println("not leap year");
    }
}