package lesson3;

public class Main3
{
    public static void main(String[] args)
    {
        int[] arr = {10, 2, 5, 8};
        int sum = 0;
        for(int a: arr)
        {
            sum+=a;
        }
        System.out.println(sum);

        sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
