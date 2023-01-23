package lesson9;

public class TestException extends Exception
{
    private String data;

    public TestException()
    {
    }

    public TestException(String message, String data)
    {
        super(message);
        this.data = data;
    }

    public void setData(String data)
    {
        this.data = data;
    }

    public String getData()
    {
        return data;
    }
}
