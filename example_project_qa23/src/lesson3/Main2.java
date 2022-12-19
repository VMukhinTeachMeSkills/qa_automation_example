package lesson3;

import java.util.Arrays;

public class Main2
{
    public static void main(String[] args)
    {
        int[] arr = new int[3];
        int a = 0;
        for (int i = 0; i < 3; i++)
        {
            arr[i] += 5;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(a);
    }
}
