package com.sortexplore;

import java.util.Scanner;

/**
 * SortBase (Abstract Class)
 *
 * This abstract class provides a base structure for all sorting algorithms.
 * It ensures that each sorting algorithm:
 * - Uses a shared Scanner object for input handling.
 * - Implements the `Run()` method to execute the sorting process.
 * - Provides a helper method `PrintArray()` to display array contents.
 *
 * Features:
 * - `sc`: Scanner instance shared across sorting classes.
 * - `PrintArray(int[])`: Prints elements of an array in a single line.
 * - `Run()`: Abstract method that each subclass must implement.
 */

 public abstract class SortBase {
    Scanner sc;

    public SortBase(Scanner sc) {
        this.sc = sc;
    }

    /**
     * Prints the elements of the given array.
     * 
     * @param items Array to be printed
     */
    public void PrintArray(int[] items) {
        for (int item : items) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    /**
     * Abstract method that must be implemented by subclasses
     * to define sorting logic.
     */
    public abstract void Run();
}
