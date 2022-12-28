package lesson6;

public class Car
{
    public static final String DEFAULT_NAME = "VW";
    public String name;
    String engine;
    String year;
    int maxSpeed;
    private double percent;
    String wheels;

    public Car()
    {
        this.engine = "1.4";
        this.year = "2010";
        this.maxSpeed = 100;
    }

    public Car(String engine, String year, int maxSpeed)
    {
        this.engine = engine;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    public Car(String engine)
    {
        this.engine = engine;
    }

    public static void drive(int speed)
    {
        if (speed > 60)
        {
            System.out.println("Speed to high");
            return;
        }
        System.out.println("Car is driving with speed " + speed);
    }

    public String getEngine()
    {
        return engine;
    }

    public void setEngine(String engine)
    {
        this.engine = engine;
    }

    public String getYear()
    {
        return year;
    }

    public void setYear(String year)
    {
        this.year = year;
    }

    public int getMaxSpeed()
    {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed)
    {
        this.maxSpeed = maxSpeed;
    }

    public double getPercent()
    {
        return percent;
    }
}
