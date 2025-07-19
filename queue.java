public class queue {
    public static void main (String args[])
    {
        qu n=new qu();
        n.enque(5);
        n.enque(6);
        n.enque(7);
        n.show();
        n.deque();
        n.show();

    }
    
}
class qu
{
    int ar[]=new int[10];
    int front=0;
    int rear=-1;
    int size=0;
    //INSERTION OF THE ELEMENT
   public void enque(int data)
   {
    rear++;
    ar[rear]=data;
    size++;

   }
   //DELETION OF THE ELEEMNT
   public void deque()
   {
    if(rear==-1)
    {
        System.out.println("queue is empty");
    }
    else{
        front++;
    }

   }
   //SHOW TH ELEMENT OF QUEUE
   public void show()
   {
    for(int i=front;i<=rear;i++)
    {
        System.out.println(ar[i]);
    }

   }
}
