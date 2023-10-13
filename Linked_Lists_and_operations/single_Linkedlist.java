package Linked_List;

public class single_Linkedlist {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;

    //adding data at begining of the list
    public void addNodeAtFirst(int data){
        Node n=new Node(data);
        if(head==null){
           head=n;
           return;
        }
        n.next=head;
        head=n;
    }
    //adding data at last
    public void addAtLast(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
            temp=temp.next;
        temp.next=n;
    }

    //adding data at specified position
    public void addAfter(int data,int pos){
        Node n=new Node(data);
        if(head==null){
            head=n;
            return;
        }
        int id=0;
        Node t=head;
        while(t!=null){
            id++;
            t=t.next;
        }
        if(id<pos)
        {
            System.out.println("invalid position");
            return;
        }
        Node cur=head;
            for (int i = 1; i < pos; i++)
                cur = cur.next;
            n.next = cur.next;
            cur.next = n;
    }

    public void deleteFirst(){
        if (head==null || head.next==null){
            head=null;
            return;}
        head=head.next;
    }

    public void deleteLast(){
        if (head==null || head.next==null){
            head=null;
            return;}
        Node t=head;
        while(t.next.next!=null)
            t=t.next;
        t.next=null;
    }

    public void delete_particular(int pos){
        if (head==null || head.next==null){
            head=null;
            return;}
        Node t=head,cur=head;
        int id=0;
        while (t!=null){
            id++;
        t=t.next;}
        if(pos>id){
            System.out.println("invalid index");
            return;}
        if(pos==1)
            deleteFirst();
        else if(pos==id)
            deleteLast();
        else{
            for(int i=1;i<pos-1;i++)
                cur=cur.next;
            cur.next=cur.next.next;



        }

    }

    //reversing the linkedlist
    public void reverse_list(){
        if(head==null || head.next==null)
            return;
 Node temp=head,cur=head.next;
 while(cur!=null){
     Node node=cur.next;
     cur.next=temp;
     temp=cur;
     cur=node;
 }
 head.next=null;
 head=temp;

    }

    //displaying the data
    public  void Display(){
        if(head==null){
            System.out.println("print list is empty");
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println(temp.data);
    }


    public static void main(String[] args) {
        single_Linkedlist single=new single_Linkedlist();
        single.addNodeAtFirst(1);
        single.addNodeAtFirst(2);
        single.addNodeAtFirst(3);
        single.addNodeAtFirst(4);
        single.Display();
        single.addAtLast(22);
        single.Display();
        single.addAfter(21,5);
        single.Display();
        single.deleteFirst();
        single.Display();
        single.deleteLast();
        single.Display();
        single.deleteLast();
        single.Display();
        single.delete_particular(4);
        single.Display();
        single.reverse_list();
        single.Display();

    }
}
