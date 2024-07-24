public class addNodelast {
    int data;
    addNodelast next;
    public addNodelast(int data)
    {
        this.data=data;
        this.next=null;
    }
    public void printData( addNodelast head)
    {
        if(head==null)
        {
            System.out.println("This is empty");
        }
        else
        {
            addNodelast temp = head;
            System.out.println("data of singly list:");
            while(temp!=null)
            {
                System.out.println("====>"+temp.data);
                temp=temp.next;
            }

        }
    }
    public addNodelast addAtStart(addNodelast head, int d)
    {
           addNodelast  newstart=new addNodelast(d);
           newstart.next=head;
           head=newstart;
           return head;
    }
    public addNodelast addAtEnd(addNodelast head, int d)
    {
        addNodelast newlast=new addNodelast(d);
        if(head==null)
        {
            head=newlast;
            return head;
        }
        else
        {
            addNodelast temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newlast;
        }
        return head;
    }
    public static void main(String[] args) {
        addNodelast a=new addNodelast(10);
        addNodelast b= new addNodelast(20);
        addNodelast c=new addNodelast(30);
        addNodelast d=new addNodelast(40);
        addNodelast h=a;
        h.next=b;
        h.next=c;
        h.next=d;
        h.printData(h);
        System.out.println("\n print data after add new node at start");
        h=h.addAtStart(h,5);
        h.printData(h);
        System.out.println("\n print data after add new Node at end");
        h=h.addAtEnd(h,50);
        h.printData(h);
        
    }
}
