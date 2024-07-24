
public class createStartNode {
    int data;
    createStartNode nxt;
    public createStartNode(int data)
    {
        this.data=data;
        this.nxt=null;
    }
    public void printData(createStartNode head)
    {
          if (head==null) {
            System.out.println("This is empty");
          }
          else
          {
              createStartNode tmp=head;
              while (tmp!=null) {
                System.out.println("This is data:"+tmp.data);
                tmp=tmp.nxt;
              }
          }
    }
    public createStartNode addAtStart(createStartNode head, int d)
    {
         createStartNode newStart=new createStartNode(d);
         newStart.nxt=head;
         head=newStart;
         return head;
    }
   public static void main(String[] args) {
    createStartNode first=new createStartNode(10);
    createStartNode second =new createStartNode(20);
    createStartNode third= new createStartNode(30);
    createStartNode four=new createStartNode(40);
    createStartNode h=first;
    h.nxt=second;
    h.nxt.nxt=third;
    h.nxt.nxt.nxt=four;
    System.out.println("This is singly linked list");
    h.printData(h);
    h=h.addAtStart(h,5);
    System.out.println("\nData insert new node at start");
    h.printData(h);
   }
}
