public class tostring {
    public static void main(String[] args) {
        car c=new car();
        System.out.println(c.toString());
        
    }
    
}
class car
{
    String name="maruti";
    String model="90 A";
    String type="5-seater";
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "name :"+name+"\nmodel :"+ model+"\ntype :"+ type;
    }
}