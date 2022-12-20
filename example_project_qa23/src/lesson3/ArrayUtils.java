package lesson3;

import java.util.Random;

public class ArrayUtils
{
    public static void fillRandom(int[] arr)
    {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = random.nextInt(100);
        }
    }
}
