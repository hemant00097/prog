package MOverriding;
public class Bike extends Vehicle
{
void run() 
{
   System.out.println("Bike is runing");
}
public static void main(String[] args) {
    Bike obj=new Bike();
    obj.run();
}
}