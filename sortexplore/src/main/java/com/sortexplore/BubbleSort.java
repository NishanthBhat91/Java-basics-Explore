package com.sortexplore;

import java.util.Scanner;

/**
 * BubbleSort Algorithm Implementation
 *
 * This class demonstrates the Bubble Sort algorithm, which is a simple
 * comparison-based sorting technique.
 *
 * How Bubble Sort Works:
 * - It repeatedly swaps adjacent elements if they are in the wrong order.
 * - The largest element "bubbles up" to the last position in each pass.
 * - The process continues until the entire array is sorted.
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

public class BubbleSort extends SortBase {
    public BubbleSort(Scanner sc)
    {
        super(sc);
    }

    public void Run()
    {
        System.out.println("Enter number of elements : ");
        int size = sc.nextInt();
        
        int[] numbers = new int[size];
        System.out.println("Enter the elements separated by a new line:");
        
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Elements in input order:");
        PrintArray(numbers);

        // Sorting in ascending order
        bubbleSort(numbers, true);
        System.out.println("Elements sorted in ascending order:");
        PrintArray(numbers);

        // Sorting in descending order
        bubbleSort(numbers, false);
        System.out.println("Elements sorted in descending order:");
        PrintArray(numbers);
    }

    /**
     * Bubble Sort Method
     * 
     * @param arr       Array to be sorted
     * @param ascending Boolean flag (true for ascending, false for descending)
     */
    private void bubbleSort(int[] arr, boolean ascending) 
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if ((ascending && arr[j] > arr[j + 1]) || (!ascending && arr[j] < arr[j + 1])) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
