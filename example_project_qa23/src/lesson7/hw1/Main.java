package lesson7.hw1;

public class Main
{

    public static void main(String[] args)
    {
        Figure[] figures = new Figure[5];
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(10);
        Triangle triangle1 = new Triangle(4, 5, 6);
        Triangle triangle2 = new Triangle(7, 8, 9);
        Rectangle rectangle1 = new Rectangle(2, 3);
        figures[0] = circle1;
        figures[1] = circle2;
        figures[2] = triangle1;
        figures[3] = triangle2;
        figures[4] = rectangle1;

        if (circle1 instanceof Circle)
        {
            System.out.println("is Figure");
        }

        double sumP = 0;
        double sumS = 0;

        for (Figure figure : figures)
        {
            sumP += figure.calculatePerimeter();
            sumS += figure.calculateSquare();
        }

        System.out.println("Perimeter: " + sumP + ", square: " + sumS);
    }
}
