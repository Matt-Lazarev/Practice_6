package ru.mirea.inbo0519.pr6.InsertionSort;

import ru.mirea.inbo0519.pr6.MergeSort.StudentList;

import java.util.Date;
import java.util.Random;

public class TestInsertion {
    public static void main (String[] args) {
        Random r = new Random();
        Date date = new Date();
        r.setSeed(date.getTime());

        System.out.println("Sorting by ID num: ");
        Student[] IDNumber = new Student[] {
                new Student("Mark", 4.5, 131),
                new Student("Ellis", 3.9, 182),
                new Student("Matt", 2.8, 123),
                new Student("Tom", 4.9, 108),
                new Student("Elle", 4.1, 192),
                new Student("Kate", 3.3, 104),
                new Student("Lem", 4.2, 137),
                new Student("Menny", 3.5, 164),
                new Student("Diana", 2.9, 113),
                new Student("Tommy", 3.4, 198),
                new Student("Ann", 4.2, 143),
                new Student("Steve", 5.0, 151)
        };

        Insertion.sortI(IDNumber);
        for(var x: IDNumber)
            System.out.println(x);
    }
}
