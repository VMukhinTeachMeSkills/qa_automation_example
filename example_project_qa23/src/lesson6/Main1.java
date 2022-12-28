package lesson6;

import lesson2.Main2;

import java.util.*;

public class Main1
{
    public static void main(String[] args)
    {
        Car car = new Car();
        Car car1; //null
        car.drive(80);
        Car car2 = new Car("1.6", "2014", 200);
        System.out.println(car.engine + " " + car.year + " " + car.maxSpeed);
        System.out.println(car2.engine + " " + car2.year + " " + car2.maxSpeed);

        lesson2.Main2 main2Lesson2 = new lesson2.Main2();
        lesson3.Main2 main2Lesson3 = new lesson3.Main2();
    }
}
