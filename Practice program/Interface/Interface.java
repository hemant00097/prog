interface Father 
{
    abstract void care();
}
interface Mother
{
    abstract void care();
}
class Son implements Father,Mother
{
    Son()
    {
        super();
        System.out.println("Son");
    }
    @Override
    public void care()
    {
        System.out.println("Father & Mother ");
    }
    public static void main(String[] args) {
        Son s1=new Son();
        s1.care();
    }
}