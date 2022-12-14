public class Q4 {

    public static int methodName(int... array) {
        int sum=0;
        for(int i=0; i<array.length; i++) {
            sum+=array[i];
     
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(methodName(10,20,30,40,50));
    }
}
