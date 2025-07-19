import java.util.ArrayList;

public class arraylist_withclass {
    public static void main(String[] args) {
        ArrayList<student> s=new ArrayList<>();

        //  var student = new student("manshi",22,260);
        // System.out.println(student.toString());
        s.add(new student("miii", 560, 30));
        s.add(new student("llllli", 57, 80));
        System.out.println(s);
    }
    
}
class student{
    String name;
    int age;
    int roll;
    student(String name,int age,int roll)
    {
        this.name=name;
        this.age=age;
        this.roll=roll;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "name :" + name +"age :"+age+"roll :"+roll;
    }
    
}
