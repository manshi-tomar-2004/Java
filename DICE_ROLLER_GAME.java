import java.util.Random;
import java.util.Scanner;

public class DICE_ROLLER_GAME {
    public static void main(String[] args) {
       
        user_input user=new user_input(); 
        computer c=new computer();
        int x = user.input(); 
        int y= c.comp();
        if(x>y)
        {
            System.out.println("yoy win");
        }
        
        if (y>x) {
            System.out.println("computer win");
            
        } else {
            System.out.println("DRAW");
            
        }
    }
    
}
class user_input
{

    int input(){
    int i;
    Scanner m=new Scanner(System.in);
    System.out.println("enetr your no b/w 1 to 6");
    i=m.nextInt();
    m.close();
    return i;
    }
   
    

}
class computer
{ 
    int comp()
    {
        
    Random r=new Random();
    int j=r.nextInt(6)+1;
    System.out.println("computer no is "+ j);
    return j;
    }

}
