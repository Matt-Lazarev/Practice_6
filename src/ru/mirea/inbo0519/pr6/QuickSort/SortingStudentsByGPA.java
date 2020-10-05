package ru.mirea.inbo0519.pr6.QuickSort;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<SortingStudentsByGPA>
{
    private String name;
    private Integer ID;
    private Double averageMark;

    public SortingStudentsByGPA(String n, double am, int num)
    {
        name = n;
        averageMark = am;
        ID = num;
    }

    @Override
    public int compare(SortingStudentsByGPA o1, SortingStudentsByGPA o2) {
        return Double.compare(o1.averageMark, o2.averageMark);
    }
    @Override
    public String toString() {
        return "Name: " + name + "  Average: " + averageMark + "  ID: " + ID;
    }
}
