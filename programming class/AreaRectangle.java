import java.util.Scanner ;
class AreaRectangle
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the two Number");
        int l=sc.nextInt();
        int w=sc.nextInt();
        sc.close();
        int A=w*l;
        int B=2*(w+l);
        System.out.println("Area of Rectangle : "+A);
        System.out.println("parameter of a Rectangle : "+B);


    }
}