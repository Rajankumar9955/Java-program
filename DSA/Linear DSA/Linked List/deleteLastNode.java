public class deleteLastNode {
    int data ;
    deleteLastNode next;
    public deleteLastNode(int data)
    {
       this.data=data;
       this.next=null;
    }
    public void printData(deleteLastNode head)
    {
        if(head==null)
        {
            System.out.println("this is empty");
        }
        else
        {
            deleteLastNode temp=head;
            while (temp!=null) {
                System.out.println("your data is here:"+temp.data);
                temp=temp.next;
            }
        }
    }
    public deleteLastNode deleteLast(deleteLastNode head)
    {
        if(head==null)
        {
            System.out.println("This is empty");
        }
        else
        {
            deleteLastNode temp=head;
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
            temp.next=null;
            
        }
        return head;
    }
    public static void main(String[] args) {
        deleteLastNode a=new deleteLastNode(10);
        deleteLastNode c=new deleteLastNode(20);
        deleteLastNode d=new deleteLastNode(30);
        deleteLastNode e=new deleteLastNode(40);
        deleteLastNode hd=a;
        hd.next=c;
        hd.next.next=d;
        hd.next.next.next=e;
        hd.printData(hd);;
        hd=hd.deleteLast(hd);
        System.out.println(" after deleted node in singly linked list:");
        hd.printData(hd);



    }
   

}
