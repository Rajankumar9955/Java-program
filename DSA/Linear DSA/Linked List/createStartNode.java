
public class createStartNode {
    int data;
    createStartNode next;
    public createStartNode(int data)
    {
        this.data=data;
        this.next=null;
    }
   public createStartNode addAtAtStart(createStartNode head,int d)
   {
    createStartNode newNode=new createStartNode(5);
    newNode.next=head;
    head=newNode;
    return head;
   }





   public static void main(String[] args) {
    head=head.addAtAtStart(5);
    
   }
}
