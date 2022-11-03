//Write A Java Program To Count The  All The Palindram Number Between 1 To 500
public class Palindrom {
    private static boolean isPalindram(int n)
    {
        int rev=0,temp=n;
        do{
            int id=n%10;
            rev=rev*10+id;
            n=n/10;
        }while(n!=0);
        return rev==temp;
    }
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<500;i++)
        {
           Boolean a= isPalindram(i);
           if(a==true)

            {
                count++;
            }
        }
        System.out.println("Palindram number 1 to 500 "+count);
    }
}
