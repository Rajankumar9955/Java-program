public class QueueDemo {
    int q[]=new int[5];
    int front=-1;
    int rear=-1;

    public void enq(int data)
    {
        if(rear==q.length-1)
        {
            System.out.println("This is overflow condition");
        }
        else
        {
            if(front==-1 && rear==-1)
            {
                front++;
                rear++;
                q[rear]=data;
            }
            else
            {
                rear++;
                q[rear]=data;
            }
        }
    }
    public void display()
    {
        if(front==-1 && rear==-1)
        {
            System.out.println("Queue is empty");
        }
        else
        {
            System.out.println("Queue elements are:");
            for(int i=front; i<=rear;++i)
            {
                System.out.println(q[i]);
            }
        }
    }
    public int deq()
    {
        int r=-1;
        if(front==-1&&rear==-1)
        {
            System.out.println("underflow condition");
        }
        else{
            if(front==rear)
            {
                r=q[front];
                front=rear=-1;
            }
            else{
                r=q[front];
                front++;
            }
        }
        return r;
    }
    public int peek()
    {
        if(front==-1 && rear==-1)
        {
            return -1;
        }
        return q[front];
    }
    public static void main(String args[])
    {
        QueueDemo qb=new QueueDemo();
        qb.enq(10);
        qb.enq(20);
        qb.enq(30);
        qb.enq(40);
        qb.enq(50);
        qb.display();
        System.out.println("\n Deleted elements:"+qb.deq());
        System.out.println("\n Deleted elements:"+qb.deq());
        System.out.println("\n Deleted elements:"+qb.deq());
        System.out.println("\n front elements:"+qb.deq());
        System.out.println("\n Deleted elements:"+qb.deq());
        System.out.println("\n Deleted elements:"+qb.deq());
        System.out.println("\n Deleted elements:"+qb.deq());
        qb.display();
    }
}

