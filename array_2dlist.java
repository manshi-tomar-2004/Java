import java.util.ArrayList;

public class array_2dlist {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> grocery=new ArrayList<>();
        ArrayList<String> food =new ArrayList<>();
        ArrayList<String> drink =new ArrayList<>();
        food.add("pizza");
        food.add("burger");
        drink.add("coffee");
        grocery.add(food);
        grocery.add(drink);
        System.out.println(grocery);
        System.out.println(grocery.get(0));
    }

    
}
