import java.util.Scanner;
public class Q18 {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the year ");
    int year=sc.nextInt();
    sc.close();
    if(year%4==0 && year%100!=0 || year%400==0)
    System.out.println(year+" Leap year ");
    else
    System.out.println(year+" Not A leep Year");

   } 
}
