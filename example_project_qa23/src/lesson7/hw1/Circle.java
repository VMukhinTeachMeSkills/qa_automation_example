package lesson7.hw1;

public class Circle implements Figure
{
    private int r;

    public Circle()
    {
    }

    public Circle(int r)
    {
        this.r = r;
    }

    @Override
    public double calculateSquare()
    {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public double calculatePerimeter()
    {
        return 2 * r * Math.PI;
    }

    public void setR(int r)
    {
        this.r = r;
    }
}
