public class Q53
{
   public static void main(String[] args) {
    int arr []= {10,20,30,40,50};
    System.out.println("Working of for loop");
    for(int i=0 ;i<arr.length;i++)
    System.out.print(arr[i]+" ");
    System.out.println("working of for each /enchanced for loop ");
    for(int i:arr)
    System.out.println(i+" ");
   }  
}
