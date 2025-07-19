import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(3);
        a.add(3);
        a.set(1, 8);
        a.clear();
        for (int i : a) {
            System.out.println(i);
        }

    }
}
