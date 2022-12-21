package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework1
{
    public static void main(String[] args)
    {
        int[] arr = new int[10];
        ArrayUtils.fillRandom(arr);
        System.out.println(Arrays.toString(arr));
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < arr.length; i++)
        {
            if (number == arr[i])
            {
                System.out.println("Входит");
                found = true;
                break;
            }
        }

        if (found)
        {
            System.out.println("Не входит");
        }
    }
}
