package lesson3;

import java.util.Arrays;
import java.util.Random;

public class Main7
{
    public static void main(String[] args)
    {
        int a[] = {5, 13, 8, 1};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        int b;
        Random random = new Random();
        b = random.nextInt(100);
        System.out.println("b=" + b);
    }
}
