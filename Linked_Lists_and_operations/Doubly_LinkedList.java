package Linked_List;

public class Doubly_LinkedList {
    class Node{
        int data;
        Node next,prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    Node head=null,tail=null;


    public void addFirst(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
            tail=n;
            tail.next=null;
            return;
        }
        head.prev=n;
        n.next=head;
        n.prev=null;
        head=n;
    }

    void addLast(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
            return;
        }
        tail.next=n;
        n.prev=tail;
        n.next=null;
        tail=n;
    }

    void addAfter(int data,int pos){
        Node n=new Node(data);
        if(head==null){
            head=n;
            tail=n;
            tail.next=null;
            return;
        }
    int c=0;
        Node temp=head,curr=head;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        if(pos==1)
            addFirst(data);
        else if(pos==c)
            addLast(data);
        else{
            for(int i=1;i<pos;i++)
                curr=curr.next;
          Node t=curr.next;
          curr.next=n;
          n.prev=curr;
          n.next=t;
          t.prev=n;

        }

    }

    void delete_First(){
        if(head==null){
            System.out.println("empty list");
            return;
        }
        head=head.next;
    }

    void delete_last(){
        if (head == null) {
            System.out.println("empty list");
            return;
        }
       Node t=tail.prev;
        t.next=null;
        tail=t;
    }

    void delete_particular(int pos){
        if (head == null) {
            System.out.println("empty list");
            return;
        }

        Node temp=head,curr=head;
        int x=0;
        while(temp!=null)
        {
            x++;
            temp=temp.next;
        }
        if(pos==1)
            delete_First();
        else if(pos==x)
            delete_last();
        else{
            for(int i=1;i<pos;i++)
                curr=curr.next;
            System.out.println("curr: " +curr.data);
           curr.next.prev=curr.prev;
           curr.prev.next=curr.next;
        }
    }
    void display(){
        if(head==null){
            System.out.println("empty list");
            return;
        }
        System.out.println("****************************** printing nodes **************************************");
        Node cur=head;
        System.out.print("                             null <-");
        while(cur.next!=null){
            System.out.print(cur.data+" -> ");
            cur=cur.next;
        }
        System.out.print(cur.data+"-> null \n ***********************************************************************************\n");
    }

    public static void main(String[] args) {
        Doubly_LinkedList d=new Doubly_LinkedList();
        d.display();
        d.addFirst(1);
        d.addFirst(2);
        d.display();
        d.addLast(3);
        d.display();
        d.addAfter(4,3);
        d.display();
        d.addAfter(5,2);
        d.display();
        d.delete_First();
        d.display();
        d.delete_last();
        d.display();
        d.delete_particular(2);
        d.display();
    }
}
