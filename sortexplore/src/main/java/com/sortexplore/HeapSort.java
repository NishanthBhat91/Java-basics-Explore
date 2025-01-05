package com.sortexplore;

import java.util.Scanner;

/**
 * HeapSort class implements the Heap Sort algorithm, which is a comparison-based sorting technique.
 * It utilizes a binary heap data structure to efficiently sort elements.
 * Heap Sort has a time complexity of O(n log n) in all cases and is an in-place sorting algorithm.
 */
public class HeapSort extends SortBase 
{
    public HeapSort(Scanner sc) 
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

        heapSort(items);

        System.out.println("Elements sorted in ascending order:");
        PrintArray(items);
    }

    /**
     * Performs Heap Sort on the array.
     * @param arr The array to be sorted.
     */
    private void heapSort(int[] arr) 
    {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) 
        {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i > 0; i--) 
        {
            swap(arr, 0, i);
            heapify(arr, i, 0);
        }
    }

    /**
     * Converts a subtree into a max heap.
     * @param arr The array representing the heap.
     * @param n The size of the heap.
     * @param i The root index of the subtree.
     */
    private void heapify(int[] arr, int n, int i) 
    {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) 
        {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) 
        {
            largest = right;
        }

        if (largest != i) 
        {
            swap(arr, i, largest);
            heapify(arr, n, largest);
        }
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

