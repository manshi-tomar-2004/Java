// NOT NEED OF RETURN TYPE VALUE
// SAME NAME AS CLASS
// NO NEEED OF CALLING CONSTRUCTOR JUST CREATE OBJECT
// Constructor overloading can be donee
//CONSTRUCTOR NOT WRITTEN INSIDE THE MAIN METHOD BCOZ CONSTRUCTOR IS ALASO AMETHOD
public class constructor {
    public static void main(String[] args) {
        Con obj = new Con();
        // Con ob = new Con(14);
        

    }
}

class Con {
    Con()// DEFAULT CONSTRUCTOR
    {
        System.out.println("hii");
    }

    Con(int a)// PARAMETERIZED CONSTRUCTOR
    {
        System.out.println(a);
    }
}
