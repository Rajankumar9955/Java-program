public class deleteFirst {
    int data;
    deleteFirst next;
    public deleteFirst(int data)
    {
          this.data=data;
           this.next=null;
    }
    public void printData(deleteFirst head)
    {
        if(head==null)
        {
            System.out.println("This is empty");
        }
        else{
              deleteFirst temp=head;
              while (temp!=null) {
                System.out.println("Your data is +>"+temp.data);
                 temp=temp.next;
              }
              
        }
    }
    public deleteFirst dltfrst(deleteFirst head)
    {
        // deleteFirst newNode=new deleteFirst(data);
        deleteFirst temp=head;
        if(head==null)
        {
            System.out.println("This empty");
        }
        else{
            temp=head.next;
        }
        return temp;
    }
    public static void main(String[] args) {
        deleteFirst db=new deleteFirst(10);
        deleteFirst ab=new deleteFirst(20);
        deleteFirst sd=new deleteFirst(30);
        deleteFirst eb=new deleteFirst(40);
        deleteFirst hb=db;
        hb.next=ab;
        hb.next.next=ab;
        hb.next.next=sd;
        hb.next.next.next=eb;
        System.out.println("\nYour data is:\n");
        hb.printData(hb);
        System.out.println("\nafter deleted data:");
        hb=hb.dltfrst(hb);
        hb.printData(hb);


    }
}
