// JAVA NOT DEPEND ON SEQUENCE
public class static_block {
    public static void main(String args[]) {
        Demo o = new Demo();
        o.value = 1;
        o.model = 34;
        o.price = 9000;

        Demo oo = new Demo();
        oo.value = 7;
        oo.model = 67;
        oo.price = 8000;
        // IF U NOT MAKE OBJECT THEN STATIC BLOCK WILL NOT EXECUTE

        o.show();
        oo.show();

    }
}

class Demo {
    int value;
    int model;
    static int price;

    void show() {
        System.out.println(value + "  " + model + "  " + price);
    }

    // the staic block call only once
    // the object may be made of infinite no. but the the static block will execute
    // only one time
    static {
        price = 23456;
        System.out.println("static block is execute");

    }
    // static block execute ---> constructor-----> object or method

    Demo() {
        value = 90;
        model = 80;
        System.out.println("constructor is execute");
    }
}
