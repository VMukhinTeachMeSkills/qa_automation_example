package lesson7;

public class Person
{
    protected String name;
    protected String surname;

    public Person()
    {
    }

    public Person(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
    }

    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }
}
