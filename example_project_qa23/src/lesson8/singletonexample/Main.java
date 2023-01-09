package lesson8.singletonexample;

public class Main
{
    public static void main(String[] args)
    {
        ArrayUtils arrayUtils = ArrayUtils.getInstance();
        ArrayUtils arrayUtils2 = ArrayUtils.getInstance();
    }
}
