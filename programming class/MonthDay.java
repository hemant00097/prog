 import java.util.Scanner;

public class MonthDay {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number ");
        int m=sc.nextInt();
        sc.close();
        switch(m)
        {
            case 1: 
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(m +" is 31 Day");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                 System.out.println(m +" is 30 Day");
                 break;
            case 2:
                 System.out.println(m+ " is 28 and 29 Day");
                 break;
            default:
                 System.out.println("Invelid month Number");     
        }
    }
    
}
