import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class MonthValidOrNot {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number ");
        int m=sc.nextInt();
        sc.close();
        if(m>=1 && m<=12)
        System.out.println(m +" is a vaild Number ");
        else 
        System.out.println(m+ " is not Valid Number ");
    }
}
