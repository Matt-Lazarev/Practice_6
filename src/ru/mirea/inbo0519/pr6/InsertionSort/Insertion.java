package ru.mirea.inbo0519.pr6.InsertionSort;

public class Insertion {
    public static<T extends Comparable<T>> void sortI(T arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            T key = arr[i];
            int j = i - 1;
            while (j >= 0 && (arr[j].compareTo(key)>0)) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
