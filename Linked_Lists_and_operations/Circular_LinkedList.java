package Linked_List;

public class Circular_LinkedList {

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    Node head=null,tail=null;
    public void addFirst(int data){
        Node n=new Node(data);
        if(head==null){
            head=tail=n;
            tail.next=head;
            return;
        }
        n.next=head;
        tail.next=n;
        head=n;
    }

    public void addLast(int data){
        Node n=new  Node(data);
        if(head==null){
            head=tail=n;
            tail.next=head;
            return;
        }
        tail.next=n;
        n.next=head;
        tail=n;

    }

    void add_After(int pos,int data){
        Node n=new Node(data);
        if(head==null){
            head=tail=n;
            tail.next=head;
            return;
        }
        int m=0;
        Node temp=head,cur=head;
        while (temp.next!=head){
            m++;
            temp=temp.next;
        }
        if(pos==1)
            addFirst(data);
        else if(pos==m+1)
            addLast(data);
        else{
            for(int i=1;i<pos;i++)
                cur=cur.next;

            Node dp=cur.next;
            cur.next=n;
            n.next=dp;
            System.out.println("cur: "+cur.data);
        }



    }

    void delete_first(){
        if(head==null || head.next==null){
            head=tail=null;
            return;
        }
        head=head.next;
        tail.next=head;
    }

    void delete_last(){
        if(head==null || head.next==null){
            head=tail=null;
            return;
        }

        Node t=head;
        while(t.next!=tail)
            t=t.next;
        t.next=head;
        tail=t;
    }

    void delete_particular(int data) {
        if (head == null || head.next == null) {
            head = tail = null;
            return;
        }
        Node temp = head, cur = head;
        int c = 0, pos = 0;
        while (temp.next != head) {
            temp = temp.next;
            c++;
        }
        for (int i = 0; i <= c; i++)
            if (data == cur.data){
                pos = i;
                break;}
        else cur=cur.next;
        if(pos==0)
            delete_first();
        else if (pos==c)
            delete_last();
        else{
            Node node=head;
            for(int i=0;i<pos-1;i++)
                node=node.next;
            node.next=node.next.next;
        }
    }
    void display(){
        if(head==null){
            System.out.println("empty list");
            return;
        }
        Node temp=head;
        while(temp.next!=head){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.print(temp.data+" -> head ");
        System.out.print("\n");

    }

    public static void main(String[] args) {
        Circular_LinkedList c=new Circular_LinkedList();

        c.addFirst(1);
        c.addFirst(2);
        c.addFirst(3);

        c.display();
        c.addLast(5);
        c.display();
        c.add_After(1,6);
        c.display();
        c.add_After(3,7);
        c.display();
        c.delete_first();
        c.display();
        c.delete_last();
        c.display();
        c.delete_particular(2);
        c.display();
    }
}
