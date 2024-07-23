


public class Node {
    int data;
    Node next;

    //member data
    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }
    public static void main(String args[])
    {
        Node first=new Node(10);
        Node second=new Node(20);
        Node third =new Node(30);
        Node four=new Node(40);
        Node head=first;
        head.next=second;
        head.next.next=third;
        head.next.next.next=four;
        System.out.println("print data of singly linked list:");
        System.out.println("=======>"+head.data);
        System.out.println("======>"+head.next.data);
        System.out.println("=====>"+head.next.next.data);
        System.out.println("====>"+head.next.next.next.data);


    }
}
