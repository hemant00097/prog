import java.util.Scanner;
class Q1
{
  public static void main(String[] args) 
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Name ");
    String name=sc.nextLine();
    System.out.println("Enter the Number ");
    long moblie= sc.nextLong();
    System.out.println("Enter the 10th percentage ");
    double pre1 = sc.nextDouble();
    System.out.println("Enter the 12th percentage ");
    double pre2 = sc.nextDouble();
    System.out.println("Enter the  percentage ");
    double pre3 = sc.nextDouble();
    sc.close();
    System.out.println("Name: "+name);
    System.out.println("MObile Number: "+moblie);
    System.out.println("10th: "+pre1);
    System.out.println("12th: "+pre2);
    System.out.println("Degree: "+pre3);

  }
}