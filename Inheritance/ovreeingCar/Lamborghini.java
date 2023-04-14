package ovreeingCar;

public class Lamborghini extends Car {
    void toSpeed()
    {
        System.out.println("320 kmph");
    }
    public static void main(String[] args) {
        Lamborghini l1=new Lamborghini();
        l1.price=40000000;
        l1.name="bmw";
        System.out.println(l1.price);
        System.out.println(l1.name);
        l1.toSpeed();
    }
}
