import java.util.Scanner;

public class Q54 {
    static int discount(int price,int percent)
    {
        int presentValue=price*percent/100;
        return price-presentValue;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        int price=sc.nextInt();
        int percent=sc.nextInt();
        System.out.println("Enter the discount percentage");
        sc.close();
        System.out.println(discount(price, percent));
    }
}
