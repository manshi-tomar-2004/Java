public class enum_practice {
    public static void main(String args[])
    {
        //DECLARARTION OF THE OBJECT OF AN ENUM CLASS
        //enum_class_name object_name = enum_class_name.the thing u want to print;
        status s= status.RUNNING;
        //USE ONLY THOSE NAME WHICH ARE INSIDE THE ENUM CLASS
        System.out.println(s);
        //GET THE number(ordinal/positioin ) inside the enum class
        status o=status.FAILED;
        System.out.println(o.ordinal());
        //if u want to print the no. of the [name]
        //CONSIDER THE STATUS AS AN ARRAY BCOZ THE NAME ARE SHOWN IN THE ARRAY
        status[] a=status.values();
        System.out.println(a[0]);
        //print all names of the enum class
        for(status i:a)
        {
            System.out.println(i);
        }
j


    }
    
}
//HERE STATUS IS THE CLASS
//THE VALUE INSIDE IT ARE THE OBJECTS
//A OBJECT IS FORM OF THE ENUM CLASS(STATUS) MAIN CLASS TO CALL IT
//WE CAN PRINT ANY STATUS JUST CALLING THE ENUM CLASS AND WRITE THE METHOD WHICH WE WANT TO CALL
enum status
{
    //NAMED CONSTANTS
    RUNNING,FAILED,SUCCES,ERROR;

}
