package ru.mirea.inbo0519.pr6.InsertionSort;

class Student implements Comparable<Student>
{
    private Integer ID;
    private String name;
    private Double averageMark;

    public Student(String n, double am, int num)
    {
        name = n;
        averageMark = am;
        ID = num;
    }

    @Override
    public int compareTo(Student o) {
        return this.ID.compareTo(o.ID);
    }

    @Override
    public String toString() {
        return "Name: " + name + "  Average: " + averageMark + "  ID: " + ID;
    }
}
