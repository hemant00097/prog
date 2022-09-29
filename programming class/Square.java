import java.util.Scanner;

public class Square {
public static void main(String[] args) 
{
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter The Nubmer ");
    int A=sc.nextInt();
    sc.close();
    int Squ1 = A*A;
    int Squ2 =4*A;
    System.out.println("side of a Square : "+Squ1);
    System.out.println("paremeter of Square : " +Squ2);

}
}
