public class iinheritance {
    public static void main(String args[]) {
        D obj = new D();
        System.out.println(obj.add(1, 2));
        System.out.println(obj.sub(10, 2));
        System.out.println(obj.mul(10, 2));

    }

}

class C {
    int add(int a, int b) {
        return a + b;
    }

    int sub(int a, int b) {
        return a - b;
    }
}

class D extends C {
    int mul(int a, int b) {
        return a * b;
    }
}