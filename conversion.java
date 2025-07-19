/*
 * large to low -- explicit
 * low to high --- implicit
 * explicit--- [ a=(data type)b;]
 * after write the float no. use f at end ===== flaot f= 3.5f;
 * to convert float into int ----- use module function
 * 
 */

public class conversion {
    public static void main(String args[]) {
        byte b = 127;
        int a = 308;
        b = (byte) a;
        // System.out.println(b);
        float f = 5.9f;

        int x = (int) f;
        System.out.println(x);
        System.out.println("");

    }

}
