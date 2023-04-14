public class MethodOverLoading {
    void Add(int a)
    {
        System.out.println(a);
    }
    void Add(int a,int b)
    {
        System.out.println(a+b);
    }
    void Add(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
    public static void main(String[] args) 
    {
        MethodOverLoading m= new MethodOverLoading();
        m.Add(10);
        m.Add(10, 20);
        m.Add(10, 20, 30);
        
    }
}
