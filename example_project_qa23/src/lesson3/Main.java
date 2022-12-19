package lesson3;

import pets.home.Cat;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        Cat[] cats = new Cat[10];
        cats[1] = new Cat();
        System.out.println(Arrays.toString(cats));
    }
}
