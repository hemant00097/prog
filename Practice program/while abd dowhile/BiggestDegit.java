import java.util.Scanner;

public class BiggestDegit {
 static int getbigges(int n)
 {
    int big=-9;
    do{
        int r=n%10;
        if(r>big)
        big=r;
        n=n/10;
    }while(n!=0);
    return big;
 }
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The Number");
    int num=sc.nextInt();
    System.out.println(getbigges(num));
    sc.close();

 }   
}
