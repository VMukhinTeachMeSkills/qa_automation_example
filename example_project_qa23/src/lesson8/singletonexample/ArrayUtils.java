package lesson8.singletonexample;

public class ArrayUtils
{
    private static ArrayUtils instance;

    private ArrayUtils()
    {
    }

    public static ArrayUtils getInstance()
    {
        if (instance == null)
        {
            instance = new ArrayUtils();
        }
        return instance;
    }
}
