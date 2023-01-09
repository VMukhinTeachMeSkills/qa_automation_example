package lesson7.hw1;

public class Triangle implements Figure
{
    private int a;
    private int b;
    private int c;

    public Triangle()
    {
    }

    public Triangle(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateSquare()
    {
        double p = calculatePerimeter();
        return Math.sqrt((p - a) * (p - b) * (p - c) * p);
    }

    @Override
    public double calculatePerimeter()
    {
        return a + b + c;
    }

    public void setA(int a)
    {
        this.a = a;
    }

    public void setB(int b)
    {
        this.b = b;
    }

    public void setC(int c)
    {
        this.c = c;
    }
}
