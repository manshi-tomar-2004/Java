
public class doubly_linkedlist {
    public static void main(String args[])
    {
        doubl n=new doubl();
        n.add(5);
        n.add(6);
        n.add(7);
        n.add(8);
        n.addfirst(1);
     n.delete(1);
        n.show();


    }
    
}
class doubl
{   node head=null;
    node current=null;
    //INSERTION
    public void add(int data)
    { 
        node newnode=new node(data);
        if(head==null)
        {
            head=newnode;
            current=newnode;
        }
        else
        {
            current.next=newnode;
            newnode.prev=current;
            current=current.next;
        }
     }
     //DISPLAY
     public void show()
     {
        node temp=null;
        for(temp=head;temp!=null;temp=temp.next)
        {
            System.out.println(temp.data);
        }
     }
     //ADD FIRST PLACE
    public void addfirst(int data)
    {
        node newnode=new node(data);
        newnode.next=head;
        head.prev=newnode;
        head=newnode;

    }
    //DELETE
    public void delete(int data)
    { node temp=null;
        node p=null;
        node q=null;
        for(temp=head;temp!=null;temp=temp.next)
        {
            if(temp.data==data)
            {
                if(temp.prev==null)
            {
                head=temp.next;
                head.prev=null;
                break;
            }
            else
            {q=temp.next;
                p=temp.prev;
                p.next=q;
                q.prev=p;

            }
                
            }
        }

    }

}
//CLASS TO CONSTRUCT THE NODE
class node{
    int data;
    node prev;
    node next;
    node(int data)
    {
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}
     
