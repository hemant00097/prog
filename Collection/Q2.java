import java.util.*;

public class Q2 {
    public static void main(String[] args) 
    {
        ArrayList<Object> al=new ArrayList<Object>();
        al.add("kl-rahul");
        al.add("Dravid");
        al.add("Rishab");
        al.add("Raina");
        al.add(45);
        Object x[]=al.toArray();
        for(int i=0;i<x.length;i++)
        {
            System.out.println(x[i]);
        }
    }
}
