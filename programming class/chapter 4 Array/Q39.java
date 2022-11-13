// write a java program to find second largest and smallest element in an array
// i/p =array[23,454,67,12,47,78,90,88]
//o/p  the second largest element in an array is -> 88
//i/p the second samllest element in an array is -> 23

    import java.util.Scanner;
    public class Q39
    {
        private static Scanner sc = new Scanner(System.in);
        public static void printArray(int[] array) 
        {
            for(int i=0; i<array.length; i++) 
            {
                System.out.print(array[i] + " ");
            }
        }
    
        public static int[] readArray() 
        {
            System.out.print("Enter the size of array ");
            int size = sc.nextInt();
    
            System.out.println("Enter the elements of array ");
            int[] array = new int[size];
            for(int i=0; i<array.length; i++) 
            {
                array[i] = sc.nextInt();
            }
    
            return array;
        }

        public static int[] sortArray(int[] array) {
            int[] samArr = array;
    
            //using k for phases
            for(int k=0; k<samArr.length-1; k++){
                for(int i=0; i<samArr.length-1-k; i++){
                    if(samArr[i] < samArr[i+1]){
                        int temp = samArr[i];
                        samArr[i] = samArr[i+1];
                        samArr[i+1] = temp;
                    }
                }
            }
    
            return samArr;
        }

    public static void main(String[] args) 
    {
        int [] array = sortArray(readArray());

        int BigsecondNum = array[1];
        System.out.println("The second largest element of array is: " + BigsecondNum);

        int SmallSecondNUM = array[array.length-2];
        System.out.println("The second smallest element of array is: " + SmallSecondNUM);
    }
}