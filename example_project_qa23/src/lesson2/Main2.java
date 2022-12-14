package lesson2;

public class Main2
{
    public static void main(String[] args)
    {
        int a = 13;
        int b = 25;

        String result1;
        if (a > b)
        {
            result1 = "a > b";
        }
        else {
            result1 = "a <= b";
        }
        System.out.println(result1);

        //---------------------

        String result = a > b ? "a > b" : "a <= b";

        System.out.println(result);

        //------------------------

        switch (a) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            default:
                System.out.println("Not a month");
        }

        if (a == 1)
        {
            System.out.println("January");
        }
        else if (a == 2)
        {
            System.out.println("February");
        }
        else if (a == 3)
        {
            System.out.println("March");
        }
        else
        {
            System.out.println("Not a month");
        }
    }
}
