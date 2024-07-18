

public class AgeException extends Throwable{
    String msg;
    public AgeException(String msg)
    {
        this.msg=msg;
    }
    public String getMsg()
    {
        return msg;
    }
}
