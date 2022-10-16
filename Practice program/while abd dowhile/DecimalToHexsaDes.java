import java.util.Scanner;
public class DecimalToHexsaDes {
    static String dectohex(int dec)
    {
        String hx=" ";
        do{
            int b=dec%16;
            if(b<10)
            hx=b+hx;
            else if(b==10)
            hx='A'+hx;
            else if(b==11)
            hx='B'+hx;
            else if(b==12)
            hx='C'+hx;
            else if(b==13)
            hx='D'+hx;
            else if(b==14)
            hx='E'+hx;
            else if(b==15)
            hx='f'+hx;
            dec=dec/16;
        }while(dec!=0);
        return hx;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        sc.close();
    
        System.out.println(dectohex(n));
    }
}
