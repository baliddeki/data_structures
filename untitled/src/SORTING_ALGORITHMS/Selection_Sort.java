package SORTING_ALGORITHMS;

import java.util.Scanner;

class Selection_Sort {

    private static void printArray(int[] array) {
        for(int i: array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    private static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    private static void selectionSort(int[] array) {
        int min;
        for(int i=0; i < array.length - 1; i++) {
            min = i;
            for(int j=i + 1; j < array.length; j++) {
                if(array[j] < array[min]) {
                    min = j;
                }
            }
            if(min != i) {
                swap(array, i, min);
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");

        int n=sc.nextInt();

        int[] array = new int[10];
        System.out.println("Enter the elements of the array: ");
        for(int b=0; b<n; b++)
        {

            array[b]=sc.nextInt();
        }
        printArray(array);
        selectionSort(array);
        printArray(array);
    }
}

