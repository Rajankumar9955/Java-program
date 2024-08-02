public class fullNode {
    int data;
    fullNode next;
    public fullNode(int data)
    {
        this.data=data;
        this.next=null;
    }
    public void display(fullNode head)
    {
        if(head==null)
        {
            System.out.println("this is empty");
        }
        else{
            fullNode temp=head;
            while(temp!=null)
            {
                System.out.println("your data is here:"+temp.data);
                temp=temp.next;
            }
        }
    }
public fullNode addFirst(fullNode head, int d)
{
    fullNode newStrt=new fullNode(d);
    newStrt.next=head;
    head=newStrt;
    return head;
}
public fullNode  addLst(fullNode head,int d){
       fullNode newlst=new fullNode(d);
       if(head==null)
       {
        head=newlst;
        return head;
       }
       else{
        fullNode temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newlst;
       }
       return head;
    }
    public fullNode posiSp(fullNode head,int d)
    {
        fullNode sp=new fullNode(d);
    }
    
}
