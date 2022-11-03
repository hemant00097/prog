// WAP To Calculate the sum of all the interger value read  read the value in command line
public class Addition {
    public static void main(String[] args) {
        int sum=0;
        for(int i=0 ; i<args.length ;i++)
        {
            sum=sum+Integer.parseInt(args[i]);
        }
        System.out.print("sum is : "+sum);
    }
}
