package ru.mirea.inbo0519.pr6.QuickSort;

import java.util.Comparator;

public class Quick {
    public static<T extends Comparator<T>> void sortQ(T arr[], int first, int last)
    {
        {
            int i = first;
            int j = last;
            T mid = arr[(first + last) / 2];
            do {
                while (arr[i].compare(arr[i], mid) < 0)
                    i++;
                while (arr[j].compare(arr[j], mid) > 0)
                    j--;

                if (i <= j)
                {
                    swap(arr, i, j);
                    i++;
                    j--;
                }

            } while (i <= j);
            if (i < last)
                sortQ(arr, i, last);
            if (first < j)
                sortQ(arr, first, j);
        }
    }

    private static <T> void swap(T arr[], int i, int j)
    {
        T t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
