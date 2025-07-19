//DEFINE ANONYMOUS CLASS
//()->{}
// lambda is (->)
//use only in functional interface
public class lambdafunction {
    public static void main(String args[])
    {
        A obj=(i)->
        {
              System.out.println("in show"+i);
        };
      //WE CAN REMOVE CURLY BRACKETS
      //() THESE BRACKETS ALSO CAN REMOVE
        obj.show(6);

    }
    
}
interface A{
    void show( int i);
    

}
/*
 * FOR PARAMETERS
 * PASS VALUE IN METHOD CALLING
 * WRITE DT VAR IN METHOD DEFI. BOTH SIDE
 * IN RETURN TYPE VALUE IN SINGLE STMT WE DONT REQUIRE THE RETUEN KEYWORD
 */
