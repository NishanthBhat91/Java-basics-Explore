package com.sortexplore;

import java.util.Scanner;

/**
 * QuickSort class implements the Quick Sort algorithm, which is a divide-and-conquer sorting technique.
 * The array is partitioned into two subarrays based on a pivot element, and each subarray is sorted recursively.
 * Quick Sort has an average and best-case time complexity of O(n log n), but its worst case is O(n^2) when poorly partitioned.
 */
public class QuickSort extends SortBase 
{
    public QuickSort(Scanner sc) 
    {
        super(sc);
    }

    public void Run() 
    {
        int count;
        System.out.println("Enter number of elements: ");
        count = sc.nextInt();
        int[] items = new int[count];

        System.out.println("Enter the elements separated by new line:");
        for (int i = 0; i < count; i++) 
        {
            items[i] = sc.nextInt();
        }

        System.out.println("Elements in input order:");
        PrintArray(items);

        quickSort(items, 0, count - 1);

        System.out.println("Elements sorted in ascending order:");
        PrintArray(items);
    }

    /**
     * Recursively sorts the array using the Quick Sort algorithm.
     * @param arr The array to be sorted.
     * @param low The starting index.
     * @param high The ending index.
     */
    private void quickSort(int[] arr, int low, int high) 
    {
        if (low < high) 
        {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    /**
     * Partitions the array around a pivot element, ensuring elements less than pivot are left, and greater are right.
     * @param arr The array to be partitioned.
     * @param low The starting index.
     * @param high The ending index.
     * @return The final pivot position.
     */
    private int partition(int[] arr, int low, int high) 
    {
        int pivot = arr[high];
        int i = low - 1;
        
        for (int j = low; j < high; j++) 
        {
            if (arr[j] < pivot) 
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    /**
     * Swaps two elements in the array.
     * @param arr The array containing elements.
     * @param i The first index.
     * @param j The second index.
     */
    private void swap(int[] arr, int i, int j) 
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

