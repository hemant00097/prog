import java.util.Scanner;
class LeapYearNot {
    public static void main(String[] args)
     {
        System.out.println("Enter the any year");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        sc.close();
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    System.out.println(year + " is a leap year");
                }
                else
                {
                    System.out.println(year + " is a not leap year");
                }
                }
                else
                {
                    System.out.println(year + " is a leap year");
                }
        }
         else{
            System.out.println(year + " is a not leap year");
            }
     }  
}
