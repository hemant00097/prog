import java.util.Scanner;

public class NameStrin {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Two Name");
        String a=sc.nextLine();
        String b=sc.nextLine();
        sc.close();
        if(a.length()>b.length())
        System.out.println(a +" a is Hight lentg ");
        else
        System.out.println(b + " b is Hight lentg");
    }
    
}
