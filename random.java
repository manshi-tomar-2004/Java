 import java.util.Random;
 public class random {
     public static void main(String args[])
     {
         Random r=new Random();
         int x=r.nextInt(9)+100;
         System.out.println(x);
   }
    
 }
// import java.util.Random;

// public class RandomFloat {
//     public static void main(String[] args) {
//         Random random = new Random();
//         float randomFloat = random.nextFloat();
//         System.out.println(randomFloat);
//     }
// }