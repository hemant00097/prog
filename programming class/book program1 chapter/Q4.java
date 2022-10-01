import java.util.Scanner ;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enetr tha Number");
        int side =sc.nextInt();
        sc.close();
        int area=side*side;
        int perimeter=4*side;
        System.out.println("Area of square: "+area);
        System.out.println("perimeter of Square: "+perimeter);

    }
    
}
