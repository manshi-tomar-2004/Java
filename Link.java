/*
public class Link {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.addfirst(10);
        list.delete(6);
        list.printList();
    }
}
class LinkedList{
    node head = null;
    node current = null;
//ADD ELEMENT IN LIST

    public void add(int data){
        node newNode = new node(data);
        if(head==null){
            head = newNode;
            current = head;
        }
        else{
            current.next = newNode;
            current = current.next;
        }
    }
//PRINT ELEMENT OF THE LIST

    public void printList(){
        node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
//AA ELEMENT AT FIRST POSITION
   public void addfirst(int data)
   {
    node newNode = new node(data);
    newNode.next=head;
    head=newNode;

   }
//DELETE THE ELEMENT
   public void delete(int data)
   {
    node t=null;
    node prev=null;
    node q=null;
    for(t=head;t!=null;t=t.next)
    {//USE ELSE BLOCK IF THE FIRST ELEMENT IS DELETED
        if(t.data==data)
        {q=t.next;
            prev.next=q;
            break;


        }
        prev=t;

    }

   }

}


class node{
    int data;
    node next;
    public node(int data){
        this.data = data;
        this.next = null;
    }
}
 */   