package lesson8;

public class Main
{
    private static WeekDays weekDays;

    public static void main(String[] args)
    {
        weekDays = WeekDays.valueOf("MONDAY");
        System.out.println(weekDays);
    }
}
