public class static_variable {
    public static void main(String args[]) {
        Mobile ob = new Mobile();
        ob.price = 123;
        ob.model = 1;

        Mobile o = new Mobile();
        o.price = 1234;
        o.model = 2;

        // here we change the value of model which appy on both object.
        // o.model = 789;
        // witout static keyword only that object model will change in which was issue.

        ob.show();
        o.show();
    }
}

class Mobile {
    int price;
    // STATIC VARIABLE CAN MAKE THE VARIABLE COMMON FOR ALL VARIABLE
    // LET MAKE "model" variable static
    static int model;
    // INSTANCE METHOD== SHOW MWTHOD
    // NON-STSTIC METHOD---> NEED THE OBJECT WHENEVER STTSIC METHOD NOT NEED THE
    // OBJECT

    void show() {
        System.out.println(price + ":" + model);
    }

}
