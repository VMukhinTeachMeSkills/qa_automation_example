package lesson3;

import java.util.Arrays;

public class Main5
{
    public static void main(String[] args)
    {
        int a[] = {5, 6, 19, 100, 8};
        int b[] = new int[5];
        for (int i = 0; i < a.length; i++)
        {
            b[i] = a[i];
        }
        System.out.println("b = " + Arrays.toString(b));

        b = new int[5];

        System.arraycopy(a, 2, b, 3, 2);
        System.out.println("b = " + Arrays.toString(b));
    }
}
