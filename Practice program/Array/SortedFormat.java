
import java.util.Scanner;

public class SortedFormat {
    public static int[] readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter the " + n + " integer value ");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        return ar;

    }

    public static void display(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }

    public static int[] merge(int[] a, int[] b) {
        int c[] = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j])
                c[k++] = a[i++];

            else
                c[k++] = b[j++];
            while (i < a.length) {
                c[k++] = a[i++];
            }
            while (j < b.length) {
                c[k++] = b[j++];
            }
        }
        return c;
    }

    public static void main(String[] args) {

        System.out.println("Read the First Array");
        int a[] = readArray();
        System.out.println("Read the Second Array ");
        int b[] = readArray();

        System.out.println("User enter first Array");
        display(a);
        System.out.println("User enter second Array");
        display(b);
        
        System.out.print("Sorted Array Element ");
        display(merge(a, b));

    }

}