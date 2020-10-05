package ru.mirea.inbo0519.pr6.MergeSort;

public class StudentList implements Comparable<StudentList>
{
        private Integer ID;
        private String name;
        private Double averageMark;

        public StudentList(String n, double am, int num)
        {
            name = n;
            averageMark = am;
            ID = num;
        }

        @Override
        public int compareTo(StudentList o) {
            return this.ID.compareTo(o.ID);
        }

        @Override
        public String toString() {
            return "Name: " + name + "  Average: " + averageMark + "  ID: " + ID;
        }
}
