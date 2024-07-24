
// full linked list
public class Node1 {
    int data;
    Node1 next;

    // member data;
    public Node1(int data)
    {
        this.data=data;
        this.next=null;
    }
    public void printData(Node1 head)
    {
        if(head==null)
        {
           System.out.println("List is empty");
        }
        else
        {
            Node1 temp=head;
            while (temp!=null) {
                System.out.println("==>"+temp.data);
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        Node1 first=new Node1(10);
        Node1 second=new Node1(20);
        Node1 third=new Node1(30);
        Node1 four=new Node1(40);
        Node1 head=first;
        head.next=second;
        head.next.next=third;
        head.next.next.next=four;
        System.out.println("Print Data of singly linked list:");
        head.printData(head);



    }

}