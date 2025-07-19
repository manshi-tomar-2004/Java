/*
 * 1. RUNTIME ERROR [WHEN U NEED A FILE IN APPLI. BUT U DELETE IT]---EXCEPTION HANDLING
 * 2.LOGICAL ERROR [2+2=5]
 * 3.COMPILE TIME ERROR
 * EXCEPTION HANDLING TYPE---
 * 1] TRY-CATCH
 * catch(Exception e){....}
 * in this the stmt after catch block will also executed if tehre is error or not
 * catch(EXCEPTION_NAME e)
 * we can write mene catch block but try block is only one
 * //IF THE CATCH BLOCK IS NOTE EXECUTE AND WE WANT TO EXECUTE IT WE USE THROW KEYWORD
 * IN TRY BLOCK--- throw newexception_name();
 * drwa ur own exception
 */
class mArithmeticException extends Exception{
    //NEED A CONSTRUCTOR TO PASS THE MESSAGE
    //WE NEED TO EXTEND THE EXCEPTION CLASS
    public mArithmeticException(String s)
    {
        super(s);
        //to print the mesaage in the own cretaed exception

    }

}
public class EXCEPTION {
    public static void main(String args[])
    {
        int i=110;
        int j=0;
        try{
            j=18/i;
            if(j==0)
            {
               // throw new ArithmeticException("THROW WILL EXECUTE");
                 throw new mArithmeticException("THROW WILL EXECUTE");
            }
        }
        catch(mArithmeticException e )
        {
            System.out.println("arthimetic error occur  "+e);
         System.out.println(e.getMessage());
        }
        System.out.println("done");
       
    }
    
}

