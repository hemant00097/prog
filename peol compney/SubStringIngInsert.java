import java.util.Scanner;
class SubStringIngInsert
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the fist number");
        String str=sc.nextLine();
        System.out.println("Enter the second String ");
        String str2=sc.nextLine();
        System.out.println("Enter the indrx number");
        int index=sc.nextInt();
        sc.close();
        String newstr=" ";

        for(int i=0;i<index;i++)
        {
            newstr=newstr+str.charAt(i);
        }
        newstr =newstr+str2;
        for(int i=index;i<str.length();i++)
        {
            newstr=newstr+str.charAt(i);
        }

        System.out.println(newstr);
    }
}