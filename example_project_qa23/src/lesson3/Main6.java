package lesson3;

import java.util.Arrays;

public class Main6
{
    public static void main(String[] args)
    {
        int a[] = new int[10];
        int b[] = new int[10];

        Arrays.fill(a, 1);
        Arrays.fill(b, 1);

        if(Arrays.equals(a, b))
        {
            System.out.println("arrays are equals");
        }
        else
        {
            System.out.println("arrays are not equals");
        }
    }
}
