import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the weight is kilograms ");
        double weight =sc.nextDouble();
        System.out.println("Enter the height in meters ");
        double height =sc.nextDouble();
        sc.close();
        double BMI =weight/(height*height);

        System.out.println("BMI of person "+BMI);
        
    }
    
}
