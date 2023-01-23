package lesson9.hw3;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        Set<String> nameSet = new HashSet<>();

        for (int i = 0; i < 10; i++)
        {
            String name = scanner.nextLine();
            names.add(name);
            nameSet.add(name);
        }

        System.out.println(names);
        System.out.println(nameSet);
        System.out.println("Повторений " + (names.size() - nameSet.size()));

    }
}
