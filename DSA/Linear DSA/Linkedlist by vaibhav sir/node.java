public class node{
    private int data;
    private node next;
    public node()
    {
        data=0;
        next=null;
    }
    public node(int data)
    {
        this.data=data;
        next=null;
    }
    public int  getData(int data)
    {
        return data;
    }
    public void setData(int data)
    {
        this.next=next;
    }
    public void setNext(node next)
    {
        this.next=next;
    }
    public node getNext()
    {
        return next;
    }
    public String toString()
    {
        return  " "+data+"----->";
    }
}
