package SORTING_ALGORITHMS;

import java.util.Arrays;
import java.util.Scanner;


public class Bubble_Sort {
    public void sort(int[] array) {


        for (var i = 0; i < array.length; i++) {

            for (var j = 1; j < array.length; j++)
                if (array[j] < array[j - 1]) {
                    swap(array, j,  j - 1);
                }
        }
    }
            private void swap (int[] array, int index1, int index2){

                var temp = array[index1];
                array[index1] = array[index2];
                array[index2] = temp;

            }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");

        int d=sc.nextInt();

        int[] a= new int[args.length];
        System.out.println("Enter the elements of the array: ");
        for(int b=0; b<d; b++)
        {

            a[b]=sc.nextInt();
        }

                var sorter = new Bubble_Sort();
                System.out.println("The sorted elements are: \n");
                sorter.sort(a);
                System.out.println(Arrays.toString(a));


            }


        }
