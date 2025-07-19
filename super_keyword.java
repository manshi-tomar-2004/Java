public class super_keyword {
    public static void main(String[] args) {
        hero h=new hero("manshi",20,"unlimited");
        System.out.println(h.toString()
        );

        
    }
}
class person
{
    String name;
    int age;
    person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub6
        return name+" : " +age;
    }
}
class hero extends person
{
    String power;
    hero(String name,int age,String power)
    {
        super(name,age);
        this.power=power;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+ power; 
    }

}
