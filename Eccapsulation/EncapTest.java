import java.util.Set;

public class EncapTest {
    private String name;
    private String IdNum;
    private int age;
 
    public int getAge()
    {
        return age;
    }
    public String getIdNum()
    {
        return IdNum;
    }
    public String getName()
    {
        return name;
    }
    public void SetAge(int newage)
    {
        this.age=newage;
    }
    public void Setname(String newName)
    {
        this.name=newName;
    }
    public void SetIdNum(String newIdnum)
    {
        this.idNum=newIdnum;
    }
    public static void main(String[] args) 
    {
        EncapTest sc=new EncapTest();
        sc.SetAge(25);
        sc.SetIdNum("1234mf");
        sc.Setname("Hemant");

        System.out.println("Name "+sc.getName());
        System.out.println("Age "+sc.getAge());
        System.out.println("IdNum "+sc.getIdNum());
    }
}
