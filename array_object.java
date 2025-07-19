public class array_object {
    public static void main(String[] args) {
        //array
        
        student s1=new student(206,20);
        student s2=new student(207,21);
        student[] info={s1,s2};
        // info[0]=s1;
        // info[1]=s2;
       for(student i:info)
       {
        System.out.println(i.toString());

       }
        
    }
    
}
class student{
    int roll;
    int age;
    student(int roll,int age)
    {
        this.age=age;
        this.roll=roll;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "roll:"+roll+"\n age:"+age;
    }
}
