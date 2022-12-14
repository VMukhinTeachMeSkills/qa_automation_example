package lesson7.hw1;

public class Rectangle implements Figure
{
    private int a;
    private int b;

    public Rectangle()
    {
    }

    public Rectangle(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateSquare()
    {
        return a * b;
    }

    @Override
    public double calculatePerimeter()
    {
        return (a + b) * 2;
    }

    public void setA(int a)
    {
        this.a = a;
    }

    public void setB(int b)
    {
        this.b = b;
    }
}
