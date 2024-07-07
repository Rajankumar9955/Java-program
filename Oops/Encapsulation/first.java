 class first {
    private int rollno=10;
    private float per=78.5f;
    private String name="Rajan";
    public int getRollno()
    {
        return rollno;
    }
    public float getPer()
    {
        return per;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setPer(float per)
    {
         this.per=per;
    }
    public void setRollno(int roll)
    {
        this.rollno=rollno;
    }
}

   class T1{
    public static void main(String args[])
    {
        first t=new first();
        t.setRollno(101);
        t.setPer(56.25f);
        t.setName("Rajan");
        System.out.println(t.getName());
        System.out.println(t.getPer());
        System.out.println(t.getRollno());
    }
   }

