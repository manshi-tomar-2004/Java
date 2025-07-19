public class getter_setter {
    public static void main(String[] args) {
        car c=new car("bmw");
        System.out.println(c.getModel());
    }
}
class car
{
    private String model;
    car(String model)
    {
        // this.model=model;
         this.setModel(model);
    }
    public String getModel()
    {
        return model;
    }
    public void setModel(String Model)
    {
        this.model= Model;
    }
}
