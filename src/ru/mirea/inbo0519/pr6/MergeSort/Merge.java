package ru.mirea.inbo0519.pr6.MergeSort;

public class Merge {
    private static void merge(StudentList arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;

        StudentList L[] = new StudentList[n1];
        StudentList R[] = new StudentList[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j]) <= 0) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public static StudentList[] mergeLists(StudentList arr1[], StudentList arr2[], int l, int r)
    {
        StudentList[] arr = new StudentList[arr1.length + arr2.length];
        int i=0;
        for(; i<arr1.length;i++)
            arr[i] = arr1[i];
        for(int j=0; j<arr2.length; j++, i++)
        {
            arr[i] = arr2[j];
        }
        return sortM(arr, l, r);
    }
    private static StudentList[] sortM(StudentList arr[], int l, int r)
    {

        if (l < r) {
            int m = (l + r) / 2;
            sortM(arr, l, m);
            sortM(arr,m + 1, r);
            merge(arr, l, m, r);
        }
        return arr;
    }
}

