package lesson4;

import lesson3.ArrayUtils;

import java.util.Arrays;

public class Main1
{
    public static void main(String[] args)
    {
        int arr[][] = new int[4][5];

        ArrayUtils.fillRandom(arr);

        ArrayUtils.print2DArray(arr);
    }
}
