import java.util.Scanner;

public class polymorphism_dynamic {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enetr the 1-for dog and 2- for fish");
        int i=s.nextInt();
        if(i==1)
        {
            Animal a=new dog();
            a.go();
        }
        else if(i==2) {
            
        
            Animal a;
            a=new fish();
            a.go();
        
            
        } 
        else {
            System.out.println("wrnog no eneter");
            
        }
        
    }
}
 class Animal
{
    void go()
    {}
}
class dog extends Animal{
    void go()
    {
        System.out.println("run");
    }
}
class fish extends Animal{
    void go()
    {
        System.out.println("swim");
    }
}
