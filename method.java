public class method {
    public static void main(String args[]) {
        computer obj = new computer();

        obj.music();
        // DECLARE THE VALUE OF ARGUMENT WITH THE VARIABLE
        // STORE THE RETURN TYPE IN SAME DATATYPE VARIABLE
        String a = obj.pen(10);
        System.out.println(a);

    }
}

class computer {
    public void music() {
        System.out.println("play music");

    }

    // DECLARE THE VALUE SAME AS CALLING TIME WITHOUT ":"
    public String pen(int b) {

        if (b > 10) {
            return "above 10";
        } else {
            return "above 10";
        }
    }

}
