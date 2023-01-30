package lesson9.hm2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main
{
    public static void main(String[] args)
    {
        List<Student> students = List.of(
                new Student("Alexey", "01", 5),
                new Student("Alexey", "02", 6),
                new Student("Vika", "02", 8),
                new Student("George", "03", 4.5f),
                new Student("Victor", "01", 6));

        List<String> un = students.stream()
                .filter(student -> student.getName() != null)
                .map(student -> student.getName())
                .limit(2)
                .distinct()
                .peek(name -> System.out.println(name))
                .collect(Collectors.toList());

        float sum = students.stream()
                .map(student -> student.getMark())
                .reduce(0f, (mark1, mark2) -> mark1 + mark2);
        System.out.println(sum);

    }
}
