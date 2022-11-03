// Write A Java Program To All The Spy Number Between 1 To 100
public class SpyNumber {
    private static boolean isspy(int n)
    {
      int sum=0, pro=1;
      do{
        int r =n%10;
        sum =sum+r;
        pro=pro*r;
        n=n/10;
      }while(n!=0);
      return sum==pro;
    
    }
    public static void main(String[] args) {
        for(int i=1;i<=100;i++)
        {
            if(isspy(i)==true)
            {
                System.out.println(i);
            }
        }
    }
}
