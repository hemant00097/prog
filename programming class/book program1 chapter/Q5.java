import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number ");
        double num=sc.nextDouble();
        sc.close();
        double meter=num/100;
        double foot=num/30.48;
        System.out.println("In Meter: "+meter+" Meter");
        System.out.println("In Foot: "+foot+" foot");
        
    }
    
}
