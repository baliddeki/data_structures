package SEARCHING_ALGORITHMS;

import java.util.Scanner;

public class Sequential_Search {        // Function for linear search
        public static int seq_search(int arr[], int x)
        {
            int n = arr.length;

            // Traverse array arr[]
            for (int i = 0; i < n; i++) {

                // If element found then
                // return that index
                if (arr[i] == x)
                    return i;
            }
            return -1;
        }

        // Driver Code
        public static void main(String args[])
        {
            // Given arr[]
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the number of elements you want to store: ");

            int d=sc.nextInt();

            int[] arr= new int[10];
            System.out.println("Enter the elements of the array: ");
            for(int b=0; b<d; b++)
            {

                arr[b]=sc.nextInt();
            }

            // Element to search
            System.out.println("Enter the element you'd like to search: ");
            int x = sc.nextInt();

            // Function Call
            int result = seq_search(arr, x);
            if (result == -1)
                System.out.print(
                        "Element is not present in array");
            else
                System.out.print("Element is present"
                        + " at index "
                        + result);
        }

    }
