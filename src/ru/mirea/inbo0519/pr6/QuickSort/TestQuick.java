package ru.mirea.inbo0519.pr6.QuickSort;

import java.util.Date;
import java.util.Random;

public class TestQuick {
    public static void main (String[] args) {
        Random r = new Random();
        Date date = new Date();
        r.setSeed(date.getTime());

        System.out.println("Sorting by mark: ");
        SortingStudentsByGPA[] IDNumber = new SortingStudentsByGPA[] {
                new SortingStudentsByGPA("Mark", 4.5, 131),
                new SortingStudentsByGPA("Ellis", 3.9, 182),
                new SortingStudentsByGPA("Matt", 2.8, 123),
                new SortingStudentsByGPA("Tom", 4.9, 108),
                new SortingStudentsByGPA("Elle", 4.1, 192),
                new SortingStudentsByGPA("Kate", 3.3, 104),
                new SortingStudentsByGPA("Lem", 4.2, 137),
                new SortingStudentsByGPA("Menny", 3.5, 164),
                new SortingStudentsByGPA("Diana", 2.9, 113),
                new SortingStudentsByGPA("Tommy", 3.4, 198),
                new SortingStudentsByGPA("Ann", 4.2, 143),
                new SortingStudentsByGPA("Steve", 5.0, 151)
        };

        Quick.sortQ(IDNumber, 0, IDNumber.length-1);
        for(var x: IDNumber)
            System.out.println(x);
    }
}
