package lesson3;

import java.util.Arrays;

public class Main8
{
    public static void main(String[] args)
    {
        int[] arr = {8, 2, 20, 21, 16, 6, 5};
        int buf;
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = 0; j < arr.length - 1 - i; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    buf = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = buf;
                }
                count++;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }
}
