//Q43. WAJP to count how many Characters present in all the Words.
//i/p= rama is a good boy
//o/p= rama --> 4
//     is --> 2
//     a --> 1
//     good --> 4
//     boy --> 3

import  java.util.Scanner;
public class Q43 
{
    static void countstringnum(String str) 
    {
        char[] ch = str.toCharArray();
        
        for(int i=0; i<ch.length; i++){
            String st = "";
            int count=0;

            while(true) {
                if(ch[i]==' ') {
                    break;
                }
                else if(i==ch.length-1) {
                    st = st + ch[i];
                    i++;
                    count++;
                    break;
                }
                else {
                    st = st + ch[i];
                    i++;
                    count++;
                }
            }

            System.out.println(st + " --> " + count);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string: ");
        String st = sc.nextLine();
        
        countstringnum(st);
    }
}