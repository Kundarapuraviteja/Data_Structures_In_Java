package Linked_List;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class Merging{

    Node merg(Node n1,Node n2){
        Node temp=null;
        if(n1==null) {
            temp = n2;
            return temp;
        }
        if(n2==null){
            temp=n1;
            return temp;}
        temp=n1;
        Node c=temp;
        while(c.next!=null)
            c=c.next;
        c.next=n2;
        return temp;

    }

}

public class merrging {
    Node head=null;

    public void add(int data) {
        Node n=new Node(data);
    if(head==null){
        head=n;
        return;
    }
    Node temp=head;
    while (temp.next!=null)
        temp=temp.next;
    temp.next=n;
    }

    void display(){
        if(head==null){
            System.out.println("empty loist");
            return;}
        Node n=head;
        while(n!=null){
            System.out.print(n.data+" -> ");
            n=n.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        merrging m1=new merrging();
        m1.add(1);
        m1.add(2);
        m1.display();
        merrging m2=new merrging();
        m2.add(3);
        m2.add(4);
        m2.display();
        m2.head=new Merging().merg(m1.head,m2.head);
        m2.display();

    }

}
