import java.util.ArrayList;

public class Foreach_loop {
    public static void main(String[] args) {
        String [] animal=new String[5];
        animal[0]="cat";
        animal[1]="dog";
        animal[2]="rat";
        animal[3]="lion";
        animal[4]="cow";
        for(String i:animal)
        {
            System.out.println(i);
        }
        ArrayList<String>bird=new ArrayList<>();
        bird.add("parrot");
        for(String i:bird)
        {
            System.out.println(i);
        }
    }
    
}
