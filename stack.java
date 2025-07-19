public class stack {
    public static void main(String args[])
    {
        stac n=new stac();
        n.push(5);
        n.push(6);
        n.push(7);
        n.push(8);
        n.show();
        n.pop();
        n.show();
        n.peek();
    }

    
}
class stac
{
    //CREATE AN ARRAY
    int arr[]=new int[5];
    int top=-1;
    int size=arr.length;
   
    public void push(int data)
    {
        if(top==size-1)
        {
            System.out.println("overfl;ow stack");
        }
        else
        {
            top++;
            arr[top]=data;

        }
       
    }
    public void pop()
    {
        if(top==-1)
        {
            System.out.println("underflow stack");

        }
        else
        {
            top--;
        }

    }
    public void peek()
    {
//SHOW THE TOP ELEMENT OF THE STACK
    }
    public void show()
    {
        for(int t=top;t>-1;t--)
        {
            
                System.out.println(arr[t]);


            
        }

    }
}
