package lesson3;

import java.util.Arrays;

public class Homework1
{
    public static void main(String[] args)
    {
        int[] arr = new int[10];
        ArrayUtils.fillRandom(arr);

        System.out.println(Arrays.toString(arr));
    }
}
