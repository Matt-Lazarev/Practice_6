package ru.mirea.inbo0519.pr6.MergeSort;

import java.util.Date;
import java.util.Random;

public class TestMerge {
    public static void main (String[] args) {
        Random r = new Random();
        Date date = new Date();
        r.setSeed(date.getTime());

        System.out.println("Sorting by ID: ");
        StudentList[] list1 = new StudentList[] {
                new StudentList("Mark", 4.5, 131),
                new StudentList("Ellis", 3.9, 182),
                new StudentList("Matt", 2.8, 123),
                new StudentList("Tom", 4.9, 108),
                new StudentList("Elle", 4.1, 192),
                new StudentList("Kate", 3.3, 104)
        };

        StudentList[] list2 = new StudentList[] {
                new StudentList("Lem", 4.2, 137),
                new StudentList("Menny", 3.5, 164),
                new StudentList("Diana", 2.9, 113),
                new StudentList("Tommy", 3.4, 198),
                new StudentList("Ann", 4.2, 143),
                new StudentList("Steve", 5.0, 151)
        };

        StudentList[] list = Merge.mergeLists(list1, list2, 0, list1.length+ list2.length-1);
        for(var x: list)
            System.out.println(x);
    }
}
