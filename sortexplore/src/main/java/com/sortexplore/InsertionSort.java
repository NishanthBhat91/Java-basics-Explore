package com.sortexplore;

import java.util.Scanner;

/**
 * InsertionSort Algorithm Implementation
 *
 * This class demonstrates the Insertion Sort algorithm, which is a simple
 * and efficient sorting method for small datasets.
 *
 * How Insertion Sort Works:
 * - It builds the sorted array one element at a time.
 * - Each new element is inserted into its correct position relative to the already sorted part.
 * - Shifts larger elements to the right to make space for insertion.
 *
 * Time Complexity:
 * - Best Case (Already Sorted): O(n)
 * - Worst/Average Case: O(n²)
 *
 * Features:
 * - Takes user input for array size and elements.
 * - Sorts the array in both ascending and descending order.
 * - Uses a helper method to avoid redundant sorting logic.
 */

 public class InsertionSort extends SortBase {

    public InsertionSort(Scanner sc) {
        super(sc);
    }

    public void Run() {
        System.out.println("Enter number of elements: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];
        System.out.println("Enter the elements separated by a new line:");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Elements in input order:");
        PrintArray(numbers);

        // Sorting in ascending order
        insertionSort(numbers, true);
        System.out.println("Elements sorted in ascending order:");
        PrintArray(numbers);

        // Sorting in descending order
        insertionSort(numbers, false);
        System.out.println("Elements sorted in descending order:");
        PrintArray(numbers);
    }

    /**
     * Insertion Sort Method
     * 
     * @param arr       Array to be sorted
     * @param ascending Boolean flag (true for ascending, false for descending)
     */
    private void insertionSort(int[] arr, boolean ascending) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && ((ascending && arr[j] > current) || (!ascending && arr[j] < current))) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }
}
