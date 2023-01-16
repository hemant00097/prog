public class Hemant2 extends StudentSingle2 {
    void disp()
    {
        roll=1;
        name="ankit";
        marks=89;
        System.out.println(roll +" "+name+" "+marks);
    }
    public static void main(String[] args) {
        Hemant2 r=new Hemant2();
        r.input();
        r.disp();
    }
    
}
