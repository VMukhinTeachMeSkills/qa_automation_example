package lesson9;

import java.io.FileNotFoundException;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            try
            {
                System.out.println("1");
                throw new ArrayIndexOutOfBoundsException();
            }
            catch (NullPointerException exception)
            {
                System.out.println("2");

            }
            finally
            {
                System.out.println("4");
            }
            System.out.println("3");
        }
        catch (ArrayIndexOutOfBoundsException exception)
        {
            System.out.println("5");
        }
        finally
        {
            System.out.println("6");
        }
    }
}
