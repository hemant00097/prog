public class Lion extends Animal {
    @Override
    void noise()
    {
        System.out.println(" Roar ");
    }
    @Override
    void eat()
    {
        System.out.println(" meat ");
    }
    public static void main(String[] args) {
        Lion l1= new Lion();
        l1.noise();
        l1.eat();
    }
}
