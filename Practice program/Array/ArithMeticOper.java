// WAP To perorme all the Arthmatic operation in two integer value  the command line
public class ArithMeticOper {
    public static void main(String[] args) 
    {
        
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);

        System.out.println("sum is : " +(a+b));
        System.out.println("difference is : "+(a-b));
        System.out.println("product is :"+ (a*b));
        System.out.println("Qutient is : "+(a/b));
        System.out.println("Rimender is : "+(a%b));
    }
}
