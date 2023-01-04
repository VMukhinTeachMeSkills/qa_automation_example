package lesson7;

public class Main
{
    public static void main(String[] args)
    {
        Printable employee = new Employee();
        employee.print();
        Employee employee1 = (Employee) employee;
    }

    public static void testMethod(Printable employee)
    {
        employee.print();
    }
}
