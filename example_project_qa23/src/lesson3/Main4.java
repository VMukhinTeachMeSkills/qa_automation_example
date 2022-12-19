package lesson3;

public class Main4
{
    public static void main(String[] args)
    {
        int arr[] = {25, 47, 34, 18, 96, 33, 28, 55, 87, 13};
        int currentMax = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (currentMax < arr[i])
            {
                currentMax = arr[i];
            }
        }
        System.out.println(currentMax);
    }
}
