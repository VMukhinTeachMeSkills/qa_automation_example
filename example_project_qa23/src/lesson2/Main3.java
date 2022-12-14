package lesson2;

public class Main3
{
    public static void main(String[] args)
    {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        //...
        System.out.println(".....");
        System.out.println("100");

        System.out.println("------------------------------------");

        for (int i = 1; i <= 100; i++)
        {
            if (i == 50)
            {
                break;
            }
            System.out.println(i);
        }

        System.out.println("------------------------------------");


        int j = 1;
        while ((j > 50) && (j < 100))
        {
            System.out.println(j);
            j++;
        }

        System.out.println("------------------------------------");

        int k = 1;
        do
        {
            System.out.println(k);
            k++;
        } while (k > 50 && k < 100);
    }
}
