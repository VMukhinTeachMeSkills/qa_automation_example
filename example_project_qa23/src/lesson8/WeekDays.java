package lesson8;

public enum WeekDays
{
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday");

    private String name;

    WeekDays(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}
