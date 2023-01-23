package lesson9.hm2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        List<Student> students = List.of(
                new Student("Slava", "01", 5),
                new Student("Vika", "02", 8),
                new Student("George", "03", 4.5f),
                new Student("Victor", "01", 6),
                new Student("Alexey", "02", 3));

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        for (Student student: students)
        {
            if (student.getName() != null && student.getName().equals(name))
            {
                System.out.println(student.getGroup() + " " + student.getMark());
                return;
            }
        }
    }
}
