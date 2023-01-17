package SORTING_ALGORITHMS;

import java.util.Scanner;

public class Quick_Sort
{
      int partition (int a[], int start, int end)
    {
        int pivot = a[end]; // pivot element
        int i = (start - 1);

        for (int j = start; j <= end - 1; j++)
        {
            // If current element is smaller than the pivot
            if (a[j] < pivot)
            {
                i++; // increment index of smaller element
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        int t = a[i+1];
        a[i+1] = a[end];
        a[end] = t;
        return (i + 1);
    }

    /* function to implement quick sort */
    void quick(int a[], int start, int end)
    {
        if (start < end)
        {
            int p = partition(a, start, end);  //p is partitioning index
            quick(a, start, p - 1);
            quick(a, p + 1, end);
        }
    }

    /* function to print an array */
    void printArr(int a[], int n)
    {
        int i;
        for (i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");

        int d=sc.nextInt();

        int[] a= new int[10];
        System.out.println("Enter the elements of the array: ");
        for(int b=0; b<d; b++)
        {

            a[b]=sc.nextInt();
        }
        int n = a.length;
        System.out.println("\nBefore sorting array elements are - ");
        Quick_Sort ex1 = new Quick_Sort();
        ex1.printArr(a, n);
        ex1.quick(a, 0, n - 1);
        System.out.println("\nAfter sorting array elements are - ");
        ex1.printArr(a, n);
        System.out.println();
    }
}
