public class anonymoius_inner_class {
    public static void main(String args[])
    {
        anon obj=new an(){
            public void show()
             {
                System.out.println("after object creation");
             }
        };
        
        obj.show();

    }
    
}
class anon
{
    public void show()
    {
        System.out.println("an");
    }
}
   
class an extends anon
{
    public void show()
    {
        System.out.println("an");
    }
}
