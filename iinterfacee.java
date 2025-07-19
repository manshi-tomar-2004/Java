//INTERFACE IS USED AS THE PLACE OF ABSTRACT 
//IN THIS THE METHOD ARE ALREADY ABSTRACT NOT NEED THE KEYWORD ABSTRACT
//INTERFACE USE IMPLEMENTS KEYWORD INSTEAD OF EXTENDS
//OBJECT NOT FORM TE INTERFACE  
//VARIABLES IN INTERFACE ARE BY DEFAULT--- STATIC OR FINAL
// a class can implement more than one interface
//INTERFACE ARE PUBLIC ABSTRACT
public class iinterfacee {
    public static void  main(String args[])
    {
        //TWO WAYS TO CALL THE INTERFACE THROUGH OTHER CLASS 
        //1.)
        // bb o=new bb();
        //2.)
        // aa o;
        //o=new bb();
      
        aa o=new bb();
        o.show();
        o.drive();
    }
    
    
}
 interface aa {
    int a=3;
    void show();
    void drive();

    
}
class bb implements aa
{

    
    public void show() {
        System.out.println("show");
       
    }

  
    public void drive() {
        System.out.println("drive");
        
    
}
}
/*INTERFACE HAS 3 TYPE:-
 * i) normal-->TWO OE MORE METHODS
 * ii) functional(sam-->SINGLE ABSTRACT METHOD)
 * iii) marker--> NO METHOD OR BLANK INTERFACE
*/

