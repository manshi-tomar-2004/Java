public class object_passing {
    public static void main(String[] args) {
        Car car=new Car("bmw");
        Gear gear = new Gear();
        gear.gg(car);
        
    }
    
}
class Car
{
    String name;
    Car(String name)
    {
        this.name=name;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return name;
    }

}
class Gear
{
    void gg(Car c)
    {
        System.out.println(c.toString());

    }

}
