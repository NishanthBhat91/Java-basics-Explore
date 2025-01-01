package com.sortexplore;

import java.util.Scanner;

/**
 * Main Class - Sorting Algorithm Selector
 *
 * This program provides a menu-based system where users can:
 * - Choose a sorting algorithm (Bubble Sort, Selection Sort, or Insertion Sort).
 * - Enter an array of numbers and see the sorted results.
 * - Repeat until they choose to exit.
 *
 * Features:
 * - Uses a loop to allow multiple sorting operations without restarting.
 * - Validates user input to prevent errors.
 * - Uses the `SortBase` reference for polymorphism.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SortBase obj;

        while (true) {
            System.out.println("\nSorting Algorithm Menu:");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Selection Sort");
            System.out.println("3. Insertion Sort");
            System.out.println("4. Merge Sort");
            System.out.println("5. Quick Sort");
            System.out.println("6. Heap Sort");
            System.out.println("7. Exit");
            System.out.print("Select operation: ");

            // Validate user input
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number between 1 and 5.");
                sc.next(); // Consume invalid input
                continue;
            }

            int input = sc.nextInt();

            // Process user choice
            switch (input) {
                case 1:
                    obj = new BubbleSort(sc);
                    obj.Run();
                    break;
                case 2:
                    obj = new SelectionSort(sc);
                    obj.Run();
                    break;
                case 3:
                    obj = new InsertionSort(sc);
                    obj.Run();
                    break;
                case 4:
                    obj = new MergeSort(sc);
                    obj.Run();
                    break;
                case 5:
                    obj = new QuickSort(sc);
                    obj.Run();
                    break;
                case 6:
                    obj = new HeapSort(sc);
                    obj.Run();
                    break;
                case 7:
                    System.out.println("Exiting program. Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please select a valid option (1-4).");
            }
        }
    }
}