import java.util.*;
class Q1
{
    public static void main(String[] args) {
      ArrayList<Object> al=new ArrayList<Object>();
      al.add("hemant");
      al.add("sandeep");
      al.add("bhupendra");
      al.add(45);
      al.add("ankit");
      System.out.println(al);
      System.out.println(al.contains("sandeep"));
      al.remove("bhupendra");
      System.out.println(al);
      System.out.println(al.size());
      System.out.println(al.isEmpty());
      al.clear();// all remove karne ke leeye 
      System.out.println(al);

    }
}