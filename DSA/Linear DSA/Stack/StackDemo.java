

public class StackDemo {
    int stack[]=new int[5];
    int top=-1;
    public void push(int data)
    {
        if(top==stack.length-1)
        {
            System.out.println("over flow condition");
        }
        else
        {
            top++;
            stack[top]=data;
        }
     }
     public void display()
     {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("stack elements are:");
            for(int i=top; i>=0; --i)
            {
               System.out.println("=>"+stack[i]);
            }
        }

    }
    public static void main(String args[])
    {
        StackDemo st=new StackDemo();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
    }

}
