package practice;

import java.util.Scanner;

public class Assw {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the value of a:=");
	int a=sc.nextInt();
	System.out.print("enter the valu of b:=");
	int b=sc.nextInt();
	sc.close();
	int temp=a;
	a=b;
	b=temp;
	System.out.println("value of a ="+a);
	System.out.println("value of b="+b);
}
}
