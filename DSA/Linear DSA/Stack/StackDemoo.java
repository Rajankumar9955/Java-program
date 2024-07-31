
public class StackDemoo {
    int Stack[]=new int[5];
    int top=-1;
    public void push(int data)
    {
        if(top==Stack.length-1)
        {
            System.out.println("over flow condition");
        }
        else
        {
            top++;
            Stack[top]=data;
        }
    }
    public int peek()
    {
        int r=-1;
        if(top==-1)
        {
            System.out.println(" stack is Empty");
        }
        else
        {
            r=Stack[top];
        }
        return r;
    }
    public void display()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("Stack elements are:");
            for(int i=top; i>=0; --i)
            {
                System.out.println(Stack[i]);
            }
        }
    }
    public int pop()
    {
        int r=-1;
        if(top==-1)
        {
            System.out.println("Under Flow");
        }
        else{
            r=Stack[top];
            top--;
        }
        return r;
    }
    public boolean isEmpty()
    {
        return top==-1?true:false;
    }
    public boolean isFull()
    {
        return top==Stack.length-1? true:false;
    }


    public static void main(String args[])
    {
       StackDemoo st=new StackDemoo();
       st.push(10);
       st.push(20);
       st.push(30);
       st.push(40);
       st.push(50);
       System.out.println("Stack is full:"+st.isFull());
       st.push(60);

       st.display();

       System.out.println("Deleted element:"+st.pop());
       System.out.println("Deleted element:"+st.pop());
       System.out.println("Deleted element:"+st.pop());

       System.out.println("Top element:"+st.peek());
       System.out.println("Deleted element:"+st.pop());
       System.out.println("Deleted element:"+st.pop());
       System.out.println("Deleted element:"+st.pop());

       System.out.println("Deleted element:"+st.isEmpty());
    }
}
 
 

