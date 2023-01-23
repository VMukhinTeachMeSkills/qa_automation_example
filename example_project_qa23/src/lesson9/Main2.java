package lesson9;

public class Main2
{
    public static void main(String[] args)
    {
        try
        {
            testMethod();
        }
        catch (TestException | NullPointerException e)
        {
            System.out.println(e.getMessage());
        }
    }

    private static void testMethod() throws TestException
    {
        System.out.println("Test method worked");
        throw new TestException("Incorrect input", "gfdg4864548gfd");
    }
}
