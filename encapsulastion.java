public class encapsulastion {
    public static void main(String a[]) {
        encap obj = new encap();
        obj.method();

    }
}

class encap {
    // IFF U MAKE PRIVATE ANY METHOD THEN U CAN ACCES IT IN SAME CLASS

    private int aa = 90;
    // System.out.println(aa);
    // CANNOT ACCES LIKE THIS U NEED TO CREATE THE METHOD

    void method() {
        System.out.println(aa);

    }
}
