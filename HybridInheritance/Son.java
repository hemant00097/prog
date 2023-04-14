public class Sson implements Father,Mother
{
    @Override
    public void caares()
    {
        System.out.println("Implementation of method ");
    }
    @Override
    public void facares()
    {
      System.out.println("Father cares method ");
    } 
    @Override
    public void macares()   
    {
      System.out.println("Mother cares method ");
    }
    public static void main(String[] args) 
    {
        Sson s= new Sson