package com.sortexplore;

import java.util.Scanner;

/**
 * MergeSort class demonstrates the Merge Sort algorithm, which is a divide-and-conquer sorting algorithm.
 * It recursively divides the array into two halves, sorts them, and then merges the sorted halves.
 */
public class MergeSort extends SortBase 
{
    public MergeSort(Scanner sc) 
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

        mergeSort(items, 0, count - 1);

        System.out.println("Elements sorted in ascending order:");
        PrintArray(items);
    }

    private void mergeSort(int[] arr, int left, int right) 
    {
        if (left < right) 
        {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private void merge(int[] arr, int left, int mid, int right) 
    {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        System.arraycopy(arr, left, leftArr, 0, n1);
        System.arraycopy(arr, mid + 1, rightArr, 0, n2);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) 
        {
            if (leftArr[i] <= rightArr[j]) 
            {
                arr[k] = leftArr[i];
                i++;
            } 
            else 
            {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) 
        {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) 
        {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}