public class anonymous_object {
    public static void main(String[] args) {
        System.out.println("hi");
        AAAA O;
        // CLASS_NAME OBJECRT_NAME
        // REFERENCE CREATION
        O = new AAAA();
        O.showw();
        // NEW CLASS_NAME. METHOD_NAME----------> ANONYMOUS OBJECT
        new exam().exaam();// ANONYMOUS OBJECT

    }

}

class AAAA {
    AAAA() {
        System.out.println("constructor");
    }

    void showw() {
        System.out.println("object create");

    }

}

class exam {
    exam() {
        System.out.println("EXAM RUN");
    }

    void exaam() {
        System.out.println("method is run");
    }
}