import java.util.ArrayList;

public class Q3 {
    public static void main(String[] args) 
    {
        ArrayList<Object> al=new ArrayList<Object>();
        al.add("kl-rahul");
        al.add("Dravid");
        al.add("Rishab");
        al.add("Raina");
        al.add(45);
        System.out.println(al);
        al.removeAll(al); // all remove karne ke leeye iss ka use karte he
        System.out.println(al);
    }
}
