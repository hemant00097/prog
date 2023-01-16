public class Dog extends Lion {
    @Override
    void noise()
    {
        System.out.println(" Bark ");
    }
    @Override
    void eat()
    {
        System.out.println(" meat ");
    }
    public static void main(String[] args) {
        Dog D1= new Dog();
        D1.noise();
        D1.eat();
    }
    
}
