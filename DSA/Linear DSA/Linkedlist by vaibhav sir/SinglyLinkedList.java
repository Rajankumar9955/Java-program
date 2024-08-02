public class SinglyLinkedList{
    private node head;
    private node tail;
    public SinglyLinkedList()
    {
        head=null;
    }
    public boolean insert(int data)
    {
        node nb=new node(data);
        if(head==null)
        {
            head=nb;
        }
        else{
            nb.setNext(head);
        }
        return true;
    }
}