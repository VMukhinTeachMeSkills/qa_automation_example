package lesson7;


public class Employee extends Person implements Printable, Readable
{
    private String company;

    public Employee()
    {
        super();
    }

    public Employee(String name, String surname, String company)
    {
        super(name, surname);
        this.company = company;
    }

    public String getCompany()
    {
        return company;
    }

    @Override
    public void print()
    {

    }

    @Override
    public void read()
    {

    }
}
