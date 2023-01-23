package lesson9.hm2;

import java.util.Objects;

public class Student
{
    private String name;
    private String group;
    private float mark;

    public Student()
    {
    }

    public Student(String name, String group, float mark)
    {
        this.name = name;
        this.group = group;
        this.mark = mark;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getGroup()
    {
        return group;
    }

    public void setGroup(String group)
    {
        this.group = group;
    }

    public float getMark()
    {
        return mark;
    }

    public void setMark(float mark)
    {
        this.mark = mark;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Float.compare(student.mark, mark) == 0 && Objects.equals(name, student.name) && Objects.equals(group, student.group);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, group, mark);
    }
}
