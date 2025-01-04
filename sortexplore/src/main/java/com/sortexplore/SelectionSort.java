package com.sortexplore;

import java.util.Scanner;

/**
 * SelectionSort Algorithm Implementation
 *
 * This class demonstrates the Selection Sort algorithm, which is an
 * in-place comparison sorting method.
 *
 * How Selection Sort Works:
 * - It repeatedly finds the smallest (or largest) element and moves
 *   it to its correct position.
 * - The first pass places the smallest element at the first index,
 *   the second pass places the second smallest element, and so on.
 *
 * Time Complexity:
 * - Best, Worst, and Average Case: O(n²) (since it always performs n² comparisons)
 *
 * Features:
 * - Takes user input for array size and elements.
 * - Sorts the array in both ascending and descending order.
 * - Uses a helper method to avoid redundant sorting logic.
 */

 public class SelectionSort extends SortBase {

    public SelectionSort(Scanner sc) {
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
        selectionSort(numbers, true);
        System.out.println("Elements sorted in ascending order:");
        PrintArray(numbers);

        // Sorting in descending order
        selectionSort(numbers, false);
        System.out.println("Elements sorted in descending order:");
        PrintArray(numbers);
    }

    /**
     * Selection Sort Method
     * 
     * @param arr       Array to be sorted
     * @param ascending Boolean flag (true for ascending, false for descending)
     */
    private void selectionSort(int[] arr, boolean ascending) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int extremeIndex = i;

            for (int j = i + 1; j < n; j++) {
                if ((ascending && arr[j] < arr[extremeIndex]) || (!ascending && arr[j] > arr[extremeIndex])) {
                    extremeIndex = j;
                }
            }

            if (extremeIndex != i) {
                int temp = arr[extremeIndex];
                arr[extremeIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
