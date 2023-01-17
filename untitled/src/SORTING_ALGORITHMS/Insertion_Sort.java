package SORTING_ALGORITHMS;

import java.util.Scanner;

public class Insertion_Sort {
    public void sort(int[] array) {                                 //mtd takes array

        for (var i = 1; i < array.length; i++) {
            var current = array[i];
            var j = i - 1;

            while ((j >= 0) && array[j] > current) {             //loop looks at previous items
                array[j + 1] = array[j];
                j --;

            }

            array[j + 1] = current;

        }
    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");

        int n=sc.nextInt();

        int[] array = new int[10];
        System.out.println("Enter the elements of the array: ");
        for(int b=0; b<n; b++)
        {

            array[b]=sc.nextInt();
        }
        var  sorter = new Insertion_Sort();
        sorter.sort(array);
        sorter.printArray(array);

    }

}

