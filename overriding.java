//OVERRIDING-----> A CLASS EXTEND ANOTHER CLASS
//---------------> METHOD NAME IS SAME OF BOTH CLASS BUT WORK DIFFRENT
//---------------> WITHOT ANY KEYWORD THE {CHILD CLASS METHOD} WILL EXECUTE
public class overriding {
    public static void main(String args[]) {
        child ob = new child();
        ob.show();

    }

}

class childd {

    void show() {
        System.out.println("childdd");
    }
}

class child extends childd {
    
    void show() {
        System.out.println("child ");
    }
}
//it show a error means it can execute any method child or parent
//to execute the child method we need to put @Override inside the child class(extend) and before the method name
